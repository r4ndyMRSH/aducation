package ru.stqa.pft.adressbook.model;

import java.util.Objects;

public class GroupData {
	private String groupName;
	private String groupHeader;
	private String groupFooter;
	private int id;

	public GroupData(int id, String groupName, String groupHeader, String groupFooter) {
		this.groupName = groupName;
		this.id = id;
		this.groupHeader = groupHeader;
		this.groupFooter = groupFooter;
	}
	
	public GroupData(String groupName, String groupHeader, String groupFooter) {
		this.groupName = groupName;
		this.id = Integer.MAX_VALUE;
		this.groupHeader = groupHeader;
		this.groupFooter = groupFooter;
	}

	public int getId() {
		return id;
	}

	

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "GroupData [groupName=" + groupName + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(groupName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroupData other = (GroupData) obj;
		return Objects.equals(groupName, other.groupName);
	}
}