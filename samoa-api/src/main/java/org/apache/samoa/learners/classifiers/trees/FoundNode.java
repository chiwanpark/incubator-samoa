/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.samoa.learners.classifiers.trees;

/**
 * Class that represents the necessary data structure of the node where an instance is routed/filtered through the
 * decision tree model.
 * 
 * @author Arinto Murdopo
 * 
 */
public final class FoundNode implements java.io.Serializable {

  /**
	 * 
	 */
  private static final long serialVersionUID = -637695387934143293L;

  private Node node;
  private final SplitNode parent;
  private final int parentBranch;

  FoundNode(Node node, SplitNode splitNode, int parentBranch) {
    this.node = node;
    this.parent = splitNode;
    this.parentBranch = parentBranch;
  }

  /**
   * Method to get the node where an instance is routed/filtered through the decision tree model for testing and
   * training.
   * 
   * @return The node where the instance is routed/filtered
   */
  public Node getNode() {
    return this.node;
  }

  /**
   * Method to set the node where an instance is routed/filtered through the decision tree model for testing and
   * training. The method is expected to be used when the original FoundNode object had null node property.
   * This is to add a reference to a newly established node object.
   * 
   * @param node  the node reference to be inserted
   */
  void setNode(Node node) {
    this.node = node;
  }

  /**
   * Method to get the parent of the node where an instance is routed/filtered through the decision tree model for
   * testing and training
   * 
   * @return The parent of the node
   */
  public SplitNode getParent() {
    return this.parent;
  }

  /**
   * Method to get the index of the node (where an instance is routed/filtered through the decision tree model for
   * testing and training) in its parent.
   * 
   * @return The index of the node in its parent node.
   */
  public int getParentBranch() {
    return this.parentBranch;
  }

}
