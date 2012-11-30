/**
 * @FileName  : WeWikiViewer.java
 * @Project   : NightHawk
 * @Date      : 2012. 7. 3. 
 * @작성자      : @author yion

 * @변경이력    :
 * @프로그램 설명 : 위키의 조회 사용자 
 */
package org.gliderwiki.web.domain;

import org.gliderwiki.framework.orm.sql.annotation.Column;
import org.gliderwiki.framework.orm.sql.annotation.Table;
import org.gliderwiki.web.vo.BaseObjectBean;

/**
 * @author yion
 *
 */
@Table("WE_WIKI_VIEWER")
public class WeWikiViewer extends BaseObjectBean {

	/**
	 * 회원순번 
	 */
	@Column(name="we_user_idx")
	private Integer we_user_idx;
	
	/**
	 * 위키순번 
	 */
	@Column(name="we_wiki_idx") 
	private Integer we_wiki_idx;
	
	/**
	 * 조회일 
	 */
	@Column(name="we_view_date") 
	private String we_view_Date;

	/**
	 * @return the we_user_idx
	 */
	public Integer getWe_user_idx() {
		return we_user_idx;
	}

	/**
	 * @param we_user_idx the we_user_idx to set
	 */
	public void setWe_user_idx(Integer we_user_idx) {
		this.we_user_idx = we_user_idx;
	}

	/**
	 * @return the we_wiki_idx
	 */
	public Integer getWe_wiki_idx() {
		return we_wiki_idx;
	}

	/**
	 * @param we_wiki_idx the we_wiki_idx to set
	 */
	public void setWe_wiki_idx(Integer we_wiki_idx) {
		this.we_wiki_idx = we_wiki_idx;
	}

	/**
	 * @return the we_view_Date
	 */
	public String getWe_view_Date() {
		return we_view_Date;
	}

	/**
	 * @param we_view_Date the we_view_Date to set
	 */
	public void setWe_view_Date(String we_view_Date) {
		this.we_view_Date = we_view_Date;
	}
	
	
}
