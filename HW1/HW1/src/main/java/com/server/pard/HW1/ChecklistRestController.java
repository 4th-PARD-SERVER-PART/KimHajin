package com.server.pard.HW1;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/list")
public class ChecklistRestController {

    private List<String> checklist = new ArrayList<>();

    public ChecklistRestController() {
        checklist.add("서버 파트장&부파드장 분들께 잘해드리기");
        checklist.add("pay it forward 실천하기");
        checklist.add("민제가 뾰로롱 외치기");
    }

    @GetMapping("")
    public String getAllList(){
        return "전체 체크 리스트를 조회합니다.\n" + checklist;
    }

    @PostMapping("/{userId}")
    public String postList(@PathVariable String userId , @RequestParam String item){
        if (item == null) {
            return "빈 항목은 추가할 수 없습니다.";
        }
        checklist.add(item);
        return userId + "님의 체크리스트에 " + item + "가 추가되었습니다.";
    }

    @GetMapping("/{userId}")
    public String getListById(@PathVariable String userId){  // userId의 타입을 String으로 변경
        return userId + "님이 작성하신 체크 리스트를 조회합니다.\n" + checklist;
    }

    @PatchMapping("/{userid}/{num}")
    public String patchList(@PathVariable String userid ,@PathVariable Integer num, @RequestParam String newContent) {
        if (num < 1 || num > checklist.size()) {
            return num + "번 항목을 찾을 수 없습니다.";
        }
        else if (newContent == null) {
            return "빈 항목은 추가할 수 없습니다.";
        }
        checklist.set(num - 1, newContent);
        return userid + "님이 작성하신 체크리스트의 " + num + "번 리스트가 " + newContent + " 로 수정되었습니다.";
    }

    @DeleteMapping("/{num}")
    public String deleteList(@PathVariable String userId, @PathVariable Integer num){
        if (num < 1 || num > checklist.size()) {
            return num + "번 항목을 찾을 수 없습니다.";
        }
        checklist.remove(num - 1);
        return userId + "님이 작성하신 체크리스트의 " + num + "번 리스트를 삭제합니다.";
    }
}
