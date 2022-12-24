package cn.zvo.translate.core;

/**
 * 网站管理后台的左侧菜单项的id唯一标示
 * @author 管雷鸣
 *
 */
public enum LanguageEnum {
	ENGLISH("english", "English"),
	CHINESE_SIMPLIFIED("chinese_simplified", "简体中文"),
	CHINESE_TRADITIONAL("chinese_traditional", "繁體中文");
	
	public final String id;		//语言名，如 english、chinese_simplified、chinese_traditional
	public final String name;		//文字说明，如 english、简体中文、繁体中文
	
	private LanguageEnum(String id, String name) { 
		this.name = name;
		this.id = id;
	}
}
