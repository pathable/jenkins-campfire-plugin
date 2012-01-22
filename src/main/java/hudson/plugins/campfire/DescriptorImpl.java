package hudson.plugins.campfire;

import hudson.Extension;
import hudson.Functions;
import hudson.tasks.Publisher;
import hudson.tasks.BuildStepDescriptor;
import hudson.model.AbstractProject;

import java.io.IOException;

import org.kohsuke.stapler.StaplerRequest;
import org.xml.sax.SAXException;
import net.sf.json.JSONObject;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

@Extension
public class DescriptorImpl extends BuildStepDescriptor<Publisher> {

  public boolean enabled = false;
  public String subdomain;
  public String token;
  public String room;
  public String hudsonUrl;
  public boolean ssl;

  public DescriptorImpl() {
    super(CampfireNotifier.class);
    load();
  }

  public boolean isEnabled() {
    return enabled;
  }

  public String getSubdomain() {
    return subdomain;
  }

  public String getToken() {
    return token;
  }

  public String getRoom() {
    return room;
  }

  public String getHudsonUrl() {
    return hudsonUrl;
  }

  public boolean getSsl() {
    return ssl;
  }

  @Override
  public boolean isApplicable(Class<? extends AbstractProject> aClass) {
    return true;
  }

  @Override
  public Publisher newInstance(StaplerRequest req, JSONObject formData)
          throws FormException {

    return super.newInstance(req, formData);
  }

  @Override
  public boolean configure(StaplerRequest req, JSONObject json) throws FormException {
    req.bindParameters(this, "campfire.");
    save();
    return super.configure(req, json);
  }

  /**
   * @see hudson.model.Descriptor#getDisplayName()
   */
  @Override
  public String getDisplayName() {
    return "Campfire Notification x2";
  }

  /**
   * @see hudson.model.Descriptor#getHelpFile()
   */
  @Override
  public String getHelpFile() {
    return "/plugin/campfire/help.html";
  }
}
