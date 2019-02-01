package com.axing.springbootmail.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	private MailService mailService;

	@Test
	public void testSimpleMail() throws Exception {
		mailService.sendSimpleMail("1284956848@qq.com","白","大傻逼");

	}
	@Test
	public void testHtmlMail() throws Exception {
		String content="<html>\n" +
				"<body>\n" +
				"    <h3>hello world ! 这是一封Html邮件!</h3>\n" +
				"</body>\n" +
				"</html>";
		mailService.sendHtmlMail("1376452978@qq.com","白h",content);
	}
	@Test
	public void sendAttachmentsMail() {
		String filePath="D:\\holiday.csv";
		mailService.sendAttachmentsMail("1284956848@qq.com", "主题：带附件的邮件", "有附件，请查收！", filePath);
	}
	@Test
	public void sendInlineResourceMail() {
		String rscId = "neo006";
		String content="<html><body>这是有图片的邮件：<img src=\'cid:" + rscId + "\' ></body></html>";
		String imgPath = "C:\\Users\\summer\\Pictures\\favicon.png";

		mailService.sendInlineResourceMail("ityouknow@126.com", "主题：这是有图片的邮件", content, imgPath, rscId);
	}

}


