package WIA1002LabAssignment.Lab8Graph.Q3_Q4;

import WIA1002LabAssignment.Lab8Graph.Q1_Q2.WeightedGraphAPI;

public class WeightedGraphAPITest_My {
    public static void main(String[] args) {
        //unWeightedGraph<String> wg = new unWeightedGraph<>();
        WeightedGraphAPI<String,String> wg = new WeightedGraphAPI<>();
        String[] cities = {"纽约", "费城", "东京", "香港", "硅谷", "巴黎" ,"伦敦"};
        for (String i : cities) {
            //添加所有的顶点
            wg.addVertex(i);
        }

        System.out.println("顶点(城市)个数：" + wg.getSize());
        System.out.println("====");

        System.out.println("顶点(城市)编号");
        for (int i = 0; i < wg.getSize(); i++)
            System.out.println(i + ": " + wg.getVertex(i) + "\t");
        System.out.println("====");

        System.out.println("费城在图内吗？ " + wg.hasVertex("费城"));
        System.out.println("长沙在图内吗？ " + wg.hasVertex("长沙"));
        System.out.println("硅谷在图内吗？ " + wg.hasVertex("硅谷"));
        System.out.println("巴黎在图内吗？ " + wg.hasVertex("巴黎"));
        System.out.println("=====");

        System.out.println("'巴黎'的索引 " + wg.getIndex("巴黎"));
        System.out.println("'多伦多'的索引 " + wg.getIndex("多伦多"));
        System.out.println("'香港'的索引 " + wg.getIndex("香港"));
        System.out.println("=======");

 /*
        System.out.println("添加一条边：纽约-费城" + wg.addEdge("纽约", "费城: "));
        System.out.println("添加一条边：纽约-非洲" + wg.addEdge("纽约", "非洲: "));
        System.out.println("添加一条边：费城-东京" + wg.addEdge("费城", "东京: "));
        System.out.println("添加一条边：东京-巴黎" + wg.addEdge("东京", "巴黎: "));
        System.out.println("添加一条边：巴黎-硅谷" + wg.addEdge("巴黎", "硅谷: "));
        System.out.println("添加一条边：硅谷-香港" + wg.addEdge("硅谷", "香港: "));
        System.out.println("添加一条边：香港-纽约" + wg.addEdge("香港", "纽约: "));
        System.out.println("添加一条边：香港-伦敦" + wg.addEdge("香港", "伦敦: "));
        System.out.println("添加一条边：香港-东京" + wg.addEdge("香港", "东京: "));
        System.out.println("添加一条边：伦敦-纽约" + wg.addEdge("伦敦", "纽约: "));
       */
        System.out.println("添加一条边：纽约-费城" + wg.addEdge("纽约", "费城","1: "));
        System.out.println("添加一条边：纽约-非洲" + wg.addEdge("纽约", "非洲","1: "));
        System.out.println("添加一条边：费城-东京" + wg.addEdge("费城", "东京","1: "));
        System.out.println("添加一条边：东京-巴黎" + wg.addEdge("东京", "巴黎","1: "));
        System.out.println("添加一条边：巴黎-硅谷" + wg.addEdge("巴黎", "硅谷","1: "));
        System.out.println("添加一条边：硅谷-香港" + wg.addEdge("硅谷", "香港","1: "));
        System.out.println("添加一条边：香港-纽约" + wg.addEdge("香港", "纽约","1: "));
        System.out.println("添加一条边：香港-伦敦" + wg.addEdge("香港", "伦敦","1: "));
        System.out.println("添加一条边：香港-东京" + wg.addEdge("香港", "东京","1: "));
        System.out.println("添加一条边：伦敦-纽约" + wg.addEdge("伦敦", "纽约","1: "));
        System.out.println("========");

        System.out.println("====以下的边没有方向，能联通就是true====");
        System.out.println("有香港-东京吗? " + wg.hasEdge("香港", "东京"));
        System.out.println("有香港-费城吗? " + wg.hasEdge("香港", "费城"));
        System.out.println("有纽约-伦敦吗? " + wg.hasEdge("纽约", "伦敦"));
        System.out.println("有伦敦-巴黎吗? " + wg.hasEdge("伦敦", "巴黎"));
        System.out.println("有伦敦-纽约吗? " + wg.hasEdge("伦敦", "纽约"));
        System.out.println("有伦敦-北京吗? " + wg.hasEdge("伦敦", "北京"));
        System.out.println("有巴黎-东京吗? " + wg.hasEdge("巴黎", "东京"));
        System.out.println("有费城-硅谷吗? " + wg.hasEdge("费城", "硅谷"));
        System.out.println("=====");

        System.out.println("香港的度degree(边的数量) 进&出的边分别有:" + wg.getIndeg("香港") + " and " + wg.getOutdeg("香港"));
        System.out.println("纽约的度degree(边的数量) 进&出的边分别有:" + wg.getIndeg("纽约") + " and " + wg.getOutdeg("纽约"));
        System.out.println("硅谷的度degree(边的数量) 进&出的边分别有:" + wg.getIndeg("硅谷") + " and " + wg.getOutdeg("硅谷"));
        System.out.println("====");

        System.out.println("====以下指向是有方向的====");
        System.out.println("硅谷指向的邻居有: " + wg.getNeighbors("硅谷"));
        System.out.println("香港指向的邻居有: " + wg.getNeighbors("香港"));
        System.out.println("纽约指向的邻居有: " + wg.getNeighbors("纽约"));
        System.out.println("====");

        System.out.println("====打印所有的有方向的边====");
        wg.printEdges();
        System.out.println("=====");
//////////////////////////////////////////////////

        System.out.println("所有的顶点按索引顺序："+wg.getAllVertexObjects());
        System.out.println("====");

        System.out.println("起点-终点的度数："+wg.getEdgeWeight("香港","东京"));
        System.out.println("起点-终点的度数："+wg.getEdgeWeight("香港","费城"));
        System.out.println("====");

        System.out.println("索引0的顶点："+wg.getVertex(0));
        System.out.println("索引1的顶点："+wg.getVertex(1));
        System.out.println("索引4的顶点："+wg.getVertex(4));
        System.out.println("====");

        System.out.println("顶点(纽约)的索引为:"+wg.getIndex("纽约"));
        System.out.println("顶点(香港)的索引为:"+wg.getIndex("香港"));
        System.out.println("====");

        System.out.println(wg.addUndirectedEdge("长沙","成都","1"));
        System.out.println("====");


        System.out.println(wg.removeEdge("巴黎","硅谷"));
        System.out.println(wg.removeEdge("硅谷","香港"));
        System.out.println(wg.removeEdge("伦敦","纽约"));
        System.out.println(wg.removeEdge("香港","纽约"));
        System.out.println(wg.removeEdge("香港","东京"));
        System.out.println(wg.removeEdge("香港","伦敦"));
        //System.out.println(wg.removeEdge("伦敦","巴黎"));//报错TMD
        System.out.println("====");


        System.out.println("====");
    }
}
