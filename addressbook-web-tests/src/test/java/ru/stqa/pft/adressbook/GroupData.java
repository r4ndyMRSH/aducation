package ru.stqa.pft.adressbook;

public class GroupData {
	private String groupName;
	private String groupHeader;
	private String groupFooter;

	public GroupData(String groupName, String groupHeader, String groupFooter) {
		this.groupName = groupName;
		this.groupHeader = groupHeader;
		this.groupFooter = groupFooter;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupHeader() {
		return groupHeader;
	}

	public void setGroupHeader(String groupHeader) {
		this.groupHeader = groupHeader;
	}

	public String getGroupFooter() {
		return groupFooter;
	}

	public void setGroupFooter(String groupFooter) {
		this.groupFooter = groupFooter;
	}
}