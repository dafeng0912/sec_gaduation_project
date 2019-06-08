package com.dafeng.sec.user.infrastructure.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DataDictionaryWriteUtil {
	// 生成文件路径
	private static String path = "/usr/ict/micro/";

	// 文件路径+名称
	private static String filenameTemp;
	// 删除文件 文件路径+名称
	private static String deleteFile;
	// 去除文件重复内容 文件路径+名称
	private static String removeDuplicate;

	/*
	 * //文件名称 private static String fileName1 = "word"; private static String
	 * fileName2 = "skills";
	 */
	/**
	 * 
	 * @param fileName 文件名称
	 * @return 是否清空成功，成功则返回true
	 */
	public static boolean deleteFile(String fileName) {
		Boolean bool = false;
		deleteFile = path + fileName + ".dic";
		File fileDelete = new File(deleteFile);
		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(fileDelete);
			fileWriter.write("");
			fileWriter.flush();
			fileWriter.close();
//			System.out.println("已经被清空的文件:" + fileDelete);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bool = true;
		return bool;

	}

	/**
	 * 创建文件
	 * 
	 * @param fileName    文件名称
	 * @param filecontent 文件内容
	 * @return 是否创建成功，成功则返回true
	 */
	public static boolean createFile(String fileName, String filecontent) {
		Boolean bool = false;
		File filePath1 = new File(path);
		if (!filePath1.exists()) {
			filePath1.mkdirs();
		}
		filenameTemp = path + fileName + ".dic";// 文件路径+名称+文件类型
		File file = new File(filenameTemp);
		try {
			// 如果文件不存在，则创建新的文件
			if (!file.exists()) {
				file.createNewFile();
				bool = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			// 创建文件成功后，写入内容到文件里
			writeFileContent(filenameTemp, filecontent);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bool;
	}

	/**
	 * 向文件中写入内容
	 * 
	 * @param filepath 文件路径与名称
	 * @param newstr   写入的内容
	 * @throws IOException
	 */

	public static boolean writeFileContent(String filepath, String newstr) throws IOException {
		Boolean bool = false;
		String filein = newstr + "\r\n";// 新写入的行，换行
		String temp = "";
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		FileOutputStream fos = null;
		PrintWriter pw = null;
		try {
			File file = new File(filepath);// 文件路径(包括文件名称)
			// 将文件读入输入流
			fis = new FileInputStream(file);
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);
			StringBuffer buffer = new StringBuffer();

			// 文件原有内容
			for (int i = 0; (temp = br.readLine()) != null; i++) {
				buffer.append(temp);
				// 行与行之间的分隔符 相当于“\n”
				buffer = buffer.append(System.getProperty("line.separator"));
			}
			buffer.append(filein);
			fos = new FileOutputStream(file);
			pw = new PrintWriter(fos);
			pw.write(buffer.toString().toCharArray());
			pw.flush();
			bool = true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			// 不要忘记关闭
			if (pw != null) {
				pw.close();
			}
			if (fos != null) {
				fos.close();
			}
			if (br != null) {
				br.close();
			}
			if (isr != null) {
				isr.close();
			}
			if (fis != null) {
				fis.close();
			}
		}
		return bool;
	}

	public static boolean removeDuplicates(String fileName) {
		Boolean bool = false;
		removeDuplicate = path + fileName + ".dic";
		File remove = new File(removeDuplicate);
		// 需要处理数据的文件位置
		FileReader fileReader = null;
		BufferedReader bufferedReader =null;
		try {
			fileReader = new FileReader(remove);
			 bufferedReader = new BufferedReader(fileReader);
			Map<String, String> map = new HashMap<String, String>();
			String readLine = null;
			int i = 0;

			try {
				while ((readLine = bufferedReader.readLine()) != null) {
					// 每次读取一行数据，与 map 进行比较，如果该行数据 map 中没有，就保存到 map 集合中
					if (!map.containsValue(readLine)) {
						map.put("key" + i, readLine);
						i++;
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 清空word文件之前生成有重复名称的 内容
			deleteFile(fileName);
			for (int j = 0; j < map.size(); j++) {
//				System.out.println(map.get("key" + j));
				// 创建文件成功后，写入内容到文件里
				try {
					// 清空word文件之前生成有重复名称的 内容 然后重新写入
					writeFileContent(removeDuplicate, map.get("key" + j));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bufferedReader.close();
				fileReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		bool = true;
		return bool;
	}
}
