package Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/michome")
public class MicHomeController {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@GetMapping
	public String showMicHome(Model model) {

		List<Map<String,Object>> micEvents = 

		model.addAttribute("micEvents", micEvents);

		return "michome";
	}

	@GetMapping("/micadd")
	public String showMicAdd() {

		return "micadd";
	}

	@GetMapping("/micedit")
	public String showMicEdit() {
		// 編集リンクが押された場合の処理
		// micedit.htmlを表示
		return "micedit";
	}

	@GetMapping("/micdel")
	public String showMicDel() {
		// 削除リンクが押された場合の処理
		// micdel.htmlを表示
		return "micdel";
	}

	@PostMapping("/micadd")
	public String processMicAdd() {
		// 新規リンクが押された際のフォームの処理
		// データベースに予定を追加する処理

		// michome.htmlにリダイレクト
		return "redirect:/michome";
	}

	@PostMapping("/micedit")
	public String processMicEdit() {
		// 編集リンクが押された際のフォームの処理
		// データベースの予定を更新する処理

		// michome.htmlにリダイレクト
		return "redirect:/michome";
	}

	@PostMapping("/micdel")
	public String processMicDel() {
		// 削除リンクが押された際のフォームの処理
		// データベースから予定を削除する処理

		// michome.htmlにリダイレクト
		return "redirect:/michome";
	}
}