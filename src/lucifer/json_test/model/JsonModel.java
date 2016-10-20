package lucifer.json_test.model;

import java.util.List;

public class JsonModel {

	private int json_id;
	private String json_name;
	private String json_remarks;

	private List<String> json_list;

	public JsonModel() {
		super();
	}

	public JsonModel(int json_id, String json_name, String json_remarks,
			List<String> json_list) {
		super();
		this.json_id = json_id;
		this.json_name = json_name;
		this.json_remarks = json_remarks;
		this.json_list = json_list;
	}

	public int getJson_id() {
		return json_id;
	}

	public void setJson_id(int json_id) {
		this.json_id = json_id;
	}

	public String getJson_name() {
		return json_name;
	}

	public void setJson_name(String json_name) {
		this.json_name = json_name;
	}

	public String getJson_remarks() {
		return json_remarks;
	}

	public void setJson_remarks(String json_remarks) {
		this.json_remarks = json_remarks;
	}

	public List<String> getJson_list() {
		return json_list;
	}

	public void setJson_list(List<String> json_list) {
		this.json_list = json_list;
	}

	@Override
	public String toString() {
		return "JsonModel [json_id=" + json_id + ", json_name=" + json_name
				+ ", json_remarks=" + json_remarks + ", json_list=" + json_list
				+ "]";
	}

}
