// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/binary-search-tree-insertion/problem?isFullScreen=true
// Problem     Binary Search Tree : Insertion
// Difficulty  Easy
// Subdomain   Trees
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-20, 07:55 a.m.
// ──────────────────────────────────────────────────



 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

	public static Node insert(Node root,int data) {
        if (root == null)
            return new Node(data);

        if (data < root.data)
            root.left = insert(root.left, data);

        else if (data > root.data)
            root.right = insert(root.right, data);

        return root;

    	
    }

