package com.xwtec.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * 测试上传文件
 * 
 * @author jtx
 *
 */
@Controller
public class TestUpload {

	@RequestMapping("/toUpload")
	public String toUpload() {
		return "upload";
	}

	@RequestMapping("/upload")
	@ResponseBody
	public String upload(MultipartFile file) {

		String result = "false";
		try {
			// 获取文件的名称 后缀
			String filename = file.getOriginalFilename();// 文件名全称
			String contentType = file.getContentType();// 类型
			String name = file.getName();// file
			// 相同文件名会覆盖，所以增加随机数 将名称设置唯一
			String uuid = UUID.randomUUID().toString().replace("-", "");
			// 存放路径
			String url = "D:/JiaTaiXin/Workspaces/eclipsemars2/springbootDemo/src/main/resources/static/" + uuid
					+ filename;
			System.out.println(url);
			// 调用 传输方法
			file.transferTo(new File(url));
			result = "ok";
		} catch (IllegalStateException e) {
			e.printStackTrace();
			result = "IllegalStateException";
		} catch (IOException e) {
			e.printStackTrace();
			result = "IOException";
		}
		return result;
	}

}
