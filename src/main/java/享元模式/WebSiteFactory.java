package 享元模式;

import java.util.Hashtable;

public class WebSiteFactory {
  private Hashtable webSites = new Hashtable();

  public WebSiteFactory() {
    webSites.put("产品展示", new ConcreteWebsite());
    webSites.put("博客", new ConcreteWebsite());
  }

  public WebSite getWebSite(String key) {
    if (!webSites.contains(key)) {
      webSites.put(key, new ConcreteWebsite());
    }
    return (WebSite) webSites.get(key);
  }
}
