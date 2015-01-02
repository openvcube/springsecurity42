/**
 * Copyright(c) http://www.open-v.com
 */
package test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * <pre>
 * 程序的中文名称。
 * </pre>
 * @author http://www.open-v.com
 * @version 1.00.00
 * <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期:     修改内容: 
 * </pre>
 */
public class PasswordEncoderTest {

	private static final Log log = LogFactory.getLog(PasswordEncoderTest.class);
	
	public static void main(String[] args) {
		PasswordEncoder pe = new BCryptPasswordEncoder();
		log.info("rod:" + pe.encode("koala"));
		log.info("----------------------");
		Md5PasswordEncoder mpe = new Md5PasswordEncoder();
		log.info("rod:" + mpe.encodePassword("koala", "111111"));
		log.info("dianne:" + mpe.encodePassword("emu", "111111"));
		log.info("scott:" + mpe.encodePassword("wombat", "111111"));
		log.info("peter:" + mpe.encodePassword("opal", "111111"));
		log.info("----------------------");
		mpe.setEncodeHashAsBase64(true);
		log.info("rod:" + mpe.encodePassword("koala", "rod"));
		log.info("dianne:" + mpe.encodePassword("emu", "dianne"));
		log.info("scott:" + mpe.encodePassword("wombat", "scott"));
		log.info("peter:" + mpe.encodePassword("opal", "peter"));
	}

}
