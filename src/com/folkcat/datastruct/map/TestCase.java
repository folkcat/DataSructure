package com.folkcat.datastruct.map;

public class TestCase {

	public static void main(String args[]) {

		// Graph graph = new Graph(10);
		//
		// /**
		// * 测试向两个相同的顶点添加边
		// */
		// assertEquals(false,graph.addEdge(1, 1));
		// assertEquals(false,graph.isEdgeExists(1, 1));
		//
		// /**
		// * 测试向不存在的点添加边
		// */
		// assertEquals(false,graph.addEdge(-1, 1));
		// assertEquals(false,graph.isEdgeExists(-1, 1));
		// assertEquals(false,graph.addEdge(1, 15));
		// assertEquals(false,graph.isEdgeExists(1, 15));
		// assertEquals(false,graph.addEdge(-1, 15));
		// assertEquals(false,graph.isEdgeExists(-1, 15));
		//
		// /**
		// * 测试向两个合理的点添加边
		// */
		// assertEquals(true,graph.addEdge(1,6));
		// assertEquals(true,graph.isEdgeExists(1, 6));
		//
		// /**
		// * 测试向已有班的顶点添加
		// */
		// assertEquals(true,graph.isEdgeExists(1, 6));
		// assertEquals(false,graph.addEdge(1,6));
		// /**
		// * 测试向边缘的点添加边
		// *
		// */
		// assertEquals(true,graph.addEdge(0, 9));
		// assertEquals(true,graph.isEdgeExists(0, 9));
		//
		// /**
		// * 测试无向图由位置大的点向位置小的点添加
		// */
		// assertEquals(true,graph.addEdge(8, 4));
		// assertEquals(true,graph.isEdgeExists(8, 4));

		/**
		 * 测试一个简单的连通图
		 */

		Graph graph = new Graph(6);
		graph.addEdge(0, 1);
		graph.addEdge(0, 5);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 4);

		graph.bsf();

		// graph.dfs();
		// int[] values = {3,4,2,1,5,0};
		// int[] result = graph.getResult().getSt();
		// for(int i = 0;i < values.length;i++){
		// assertEquals(values[i],result[i]);
		// }

		/**
		 * 测试一个非连通图
		 * 
		 */
		// graph = new Graph(6);
		//
		// graph.addEdge(0, 1);
		// graph.addEdge(0, 5);
		// graph.addEdge(0, 2);
		// graph.addEdge(1, 2);
		// graph.addEdge(1, 4);
		// graph.addEdge(2, 4);
		//
		// graph.dfs();
		//
		// values = new int[] {4,2,1,5,0};
		// result = graph.getResult().getSt();
		// for(int i = 0;i < values.length;i++){
		// assertEquals(values[i],result[i]);
		// }
	}
}