Adjacency List
Programming challenge description:
Write a program that builds an adjacency list representation of a simple undirected graph.

Input:
An undirected graph represented as an adjacency matrix, that is a square n \times nn×n matrix containing only zeros and ones.
The element in the cross of the ii row and the jj column is equal to 1 if and only if there is an edge between vertices ii and jj in the graph.

Each line of input contains the space-separated set of elements of the corresponding row of the adjacency matrix. For example:

0 1 1 1 1
1 0 0 1 0
1 0 0 1 1
1 1 1 0 0
1 0 1 0 0
The first row means that vertex with index 0 is adjacent to (i.e., shares an edge with) the vertices 1, 2, 3, and 4. The second row means that vertex 1 is adjacent to vertices 0 and 3, and so on.

Vertex indices are continuous integer numbers from 0 to (n-1)(n−1), where nn is a count of vertices in the graph.

See the attachments tab for an image representation of this graph.

Output:
An adjacency list of the given graph.

Each line of the output contains one element of the list, which is a space-separated set of numbers. The first number is a vertex index, and all others are the vertices that the current vertex is adjacent to. For example:

0 1 2 3 4
1 0 3
2 0 3 4
3 0 1 2
4 0 2
Test 1
Test Input
Download Test 1 Input
0 1 1 1 1
1 0 0 1 0
1 0 0 1 1
1 1 1 0 0
1 0 1 0 0
Expected Output
Download Test 1 Input
0 1 2 3 4
1 0 3
2 0 3 4
3 0 1 2
4 0 2
Test 2
Test Input
Download Test 2 Input
0 1 1
1 0 1
1 1 0
Expected Output
Download Test 2 Input
0 1 2
1 0 2
2 0 1
Test 3
Test Input
Download Test 3 Input
0 1 1 1 0 0 0 0
1 0 1 1 0 0 0 0
1 1 0 1 1 0 0 0
1 1 1 0 0 1 0 0
0 0 1 0 0 1 1 1
0 0 0 1 1 0 1 1
0 0 0 0 1 1 0 1
0 0 0 0 1 1 1 0
Expected Output
Download Test 3 Input
0 1 2 3
1 0 2 3
2 0 1 3 4
3 0 1 2 5
4 2 5 6 7
5 3 4 6 7
6 4 5 7
7 4 5 6
Test 4
Test Input
Download Test 4 Input
0 0 0
0 0 0
0 0 0
Expected Output
Download Test 4 Input
0
1
2
