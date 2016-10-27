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
		list1.add("ȥ�ĳ�");
		list1.add("�ļ�");
		list1.add("����ʱ");

		List<String> list2 = new ArrayList<String>();
		list2.add("�Ƕ���");
		list2.add("����");
		list2.add("���ܾ�");

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

		// javaBean ת����json����
		// String jsonString = JsonUtil.createJsonString(json1);

		// json����ת����javaBean
		// json3 = JsonUtil.changeJsonToObject(jsonString, JsonModel.class);
		// System.out.println(json3.getJson_name());

		// list�б�ת����json�ַ���
		String jsonlist = JsonUtil.createJsonList(jsonlist1);
		// System.out.println(jsonlist);

		// json����ת����list�б�
		List<JsonModel> list3 = JsonUtil.changeGsonToList(jsonlist,
				JsonModel.class);
		//System.out.println(list3);
	}
}
