package Software;

public class forTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] item = {"질레트 퓨전 프로쉴드 칠 면도기 2UP(기1+날2)", "[피코크] 펭수혼합죽 450g×2봉 기획", "[피코크] 펭수진한전복죽 450g*2봉 기획", "[피코크] 펭수사골소고기죽 450g×2봉 기획", "템포 내추럴순면 패드 16P (중형)", "[LG생활건강]히말라야 핑크솔트 치약 100gX3 아이스카밍", "히말라야핑크솔트 펌핑치약 플로럴민트", "히말라야핑크솔트 펌핑치약 아이스민트", "[LG생활건강]히말라야 핑크솔트 담은치약 100gX3 플로럴", "페리오 핑크솔트 칫솔 4입", "순창 태양초고추장 1.9kg", "파세오 도톰한3겹소프트30*18롤", "(G)피코크 헤이즐넛프랄린 48입", "포스트 오곡 코코볼바 100g (25g x 4개입)", "동서 포스트 콘푸라이트바 4입(27g*4)", 
				"[피코크] 콜드브루스위트아메리카노(390ml×6)", "[청정원] 순창 재래식생된장 2kg+300g", "바나나칩 (20g*6입/박스)", "베비언스 퍼스트니플 L", "베비언스 퍼스트니플 S", "이지드라이샤워타올110(하드)", "이지드라이샤워타올120(하드)", "조미오징어 200g", "프리미엄버블샤워타올(하드)", "질러 부드러운 육포 150g (30g*5)", "육포/조미오징어/김 등 최대 40% 할인", "(단독) 좋은느낌 아이오오 울날대 8P+ 리필용 8P*2개[네오2]", "[레드와인] 메나쥬 아 트로와 미드나잇 레드", "[레드와인] 메나쥬 아 트로와 실크 레드", "[레드와인] 메나쥬 아 트로와 카베르네소비뇽"};
		for(int i = 0;i<item.length;i++) {
			
		}
		
		
	}

	private static String subStrByte(String str, int i) {
		StringBuffer sbStr = new StringBuffer(i);
		if(!str.isEmpty()) {
			str = str.trim();
			if(str.getBytes().length <= i) {
				return str;
			} else {				
				int nCnt = 0;
				for(char ch:str.toCharArray()) {
					nCnt += String.valueOf(ch).getBytes().length;
					if(nCnt > i) break;
					sbStr.append(ch);
				}
			}
		}
		return sbStr.toString();
	}

}
