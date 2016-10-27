package lucifer.json_test.client;

import java.util.ArrayList;
import java.util.List;

import lucifer.json_test.model.JsonModel;
import lucifer.json_test.util.JsonUtil;

public class Main {

	static JsonModel json1;
	static JsonModel json2;
	static JsonModel json3 = new JsonModel();

	static List<JsonModel> jsonlist1 = new ArrayList<JsonModel>();
	static List<JsonModel> jsonlist2 = new ArrayList<JsonModel>();

	public static void init() {
		List<String> list1 = new ArrayList<String>();
		list1.add("去哪吃");
		list1.add("文件");
		list1.add("倒计时");

		List<String> list2 = new ArrayList<String>();
		list2.add("是多少");
		list2.add("部分");
		list2.add("房管局");

		json1 = new JsonModel(1, "lucifer", "lucifer_remark", list1);
		json2 = new JsonModel(2, "Mercury", "mercury_remark", list2);

		jsonlist1.add(json1);
		jsonlist1.add(json2);
		
		//jsonlist1.add(json1);
		//jsonlist1.add(json2);
		
		//jsonlist1.add(json1);
		//jsonlist1.add(json2);
	}

	public static void main(String[] args) {
		init();

		// javaBean 转换成json数据
		// String jsonString = JsonUtil.createJsonString(json1);

		// json数据转换成javaBean
		// json3 = JsonUtil.changeJsonToObject(jsonString, JsonModel.class);
		// System.out.println(json3.getJson_name());

		// list列表转换成json字符串
		String jsonlist = JsonUtil.createJsonList(jsonlist1);
		// System.out.println(jsonlist);

		// json数据转换成list列表
		List<JsonModel> list3 = JsonUtil.changeGsonToList(jsonlist,
				JsonModel.class);
		//System.out.println(list3);
	}
}
