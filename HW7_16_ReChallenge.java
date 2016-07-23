package TeamNova_7_27;


/*
 * Date : 2016.7.18(월)
 * Name : 김형근
 * Email: gudrmsglgl@naver.com
 * 
 * Info : 7.16 하드웨어 노프 팀장님 3Layer 질문 돌파하기
 * 
 * 7.17(일) 
 * Update: 1. OSX 이클립스 설치 환경 설정.
 * 		   2. 프로그램 컨셉 설정 (7.16 타임머신)
 * 		   3. String 의 특정 변수를 
 * 			  터미널에서 색상을 변경하려고 하여 라이브러리를 찾아 추가하였으나 
 * 		      터미널에서 import error로 4시간 동안 찾았으나 해결 안됨.  
 * 7.18(월)			
 * Update: 1. System.out.println 함수로 변경하여 가독성 증가시킴
 * 		   2. 질문 리스트 생각 및 자료 정리 중
 *         3. contain 메소드를 이용하여 문장에 맞는 단어가 있는지로 답 여부 확인 기능
 * 
 * 7.19()			
 * Update: 1. pass_num 점수 설정
 * 		   2. CPU 동작 원리 : 프론트 엔드 백엔드 처음부터 언급 했을 경우 , 언급하지 않았을 경우 
 *         3. 작업 다시 --> 프론트 엔드 백엔드 처음부터 언급 했을 경우 거의 정리
 *            현재 --> cpu 고를 시 주의 점 질문&답변 작업 중 
 *         4. 앞으로 작업 할 것  --> 프론트 엔드 백엔드 언급 안했을 경우 작업 하기
 *         5. 앞으로 작업 할 것 --> 3~4번을 맞혔을 틀렸을 경우 동시에 cpu 고를 시 주의 점 질문 답변으로 수정하기 
 * 
*/
import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

import java.util.Scanner;

public class HW7_16_ReChallenge {
	private static int pass_num = 0; 
	private static String answer = "";
	//main
	public static void main(String[] args){

		if(init_start()){
			questionAnswer();
		}
		PRINT("프로그램이 종료 되었습니다. 현실로 복귀.");
	}
	
	//도입부 (시나리오 부분)
	public static boolean init_start(){
		while(true){
			int int_choice = 0;
			PRINT("--------------------------------------------");
			PRINT("          작전명: 7.16 타임머신                 ");
			PRINT("     (* 최적 PC 과제, 수준 미달을 돌파하라! )       ");
			PRINT("--------------------------------------------");
			enter();enter();
			PRINT("       *때는 7.23 과거를 돌려야 한다!*       ");
			enter();
			PRINT("타임머신을 이용하시겠습니까?");
			PRINT("(숫자로 입력해주세요.)");
			PRINT("1. 예    2. 아니오    3. 프로그램 종료");
			Scanner sc = new Scanner(System.in);
			int_choice =sc.nextInt();
			if(int_choice == 1){
				try {
					enter();
					PRINT("슈우우우우웅~~~~~~~~~!!!!@!@!@!@!@!@!");
					PRINT("쾅쾅쾅!!!! 뚜둔!!!  !!!!@!@!@!@!@!@!");
					enter();
					PRINT(" Date :7.16 18:00.... !!!!");
					enter();
					Thread.sleep(1);
					PRINT("-- 노프팀장 -- : 안녕하세요~ 표정이 밝으시네요^^");
					PRINT(" (찌든표정이 아니네? *_*)");
					enter();
					Thread.sleep(1);;
					PRINT("-- 노프팀장 -- : 발표해봅시다. 누가 먼저 발표하실래요.");
					enter();
					Thread.sleep(1);;
					PRINT("-- 팀노바_김형근 -- : 제가 발표하겠습니다.  ");
					Thread.sleep(1);;
					PRINT("-- 팀노바_김형근 -- : 저는 프로그래밍 최적합 PC를 조사하였습니다.");
					enter();
					Thread.sleep(1);;
					PRINT("-- 노프팀장 -- : 최종 사양 한 번 봅시다.");
					enter();
					Thread.sleep(1);;
					PRINT("- CPU : 인텔 코어i5-6세대 6600K (스카이레이크) (정품)");
					PRINT("- RAM : TeamGroup DDR4 16G PC4-19200 Elite");
					PRINT("- 메인보드 : ECS DURATHON2 H110M4-C3D 코잇(Intel H110)");
					PRINT("- GPU : 갤럭시 GALAX 지포스 GTX750 Ti OC 개간지 D5 1GB ");
					PRINT("- SSD : 갤럭시 GALAX GAMER L SSD V2 (240GB)");
					PRINT("- 케이스 : COX AG 200X USB3.0 풀 아크릴 윈도우");
					PRINT("- 파워 : POWEREX REX III 500W Triple V2.3 (500W)");
					enter();
					//Thread.sleep(2000);;
					PRINT("-- 노프팀장 -- : 흠....잠시만요.....");
					//Thread.sleep(2000);;
					return true;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}else if(int_choice == 2){
				PRINT("하드웨어 과제 포기다 ㅉㅉㅉ");
				enter();enter();
			}else if(int_choice == 3){
				return false;
			}else{
				return false;
			}
		}
	}
	
	
	//질문과 답변(CPU, RAM, 메인보드, VGA, SSD, Power)
	public static void questionAnswer(){
		
		while1 : while(true){ //0.1 while
		PRINT("(CPU, RAM, GPU 중 질문 받고 싶은 것을 고른다.) 프로그램 종류 원할 시 키워드 : 종료");
		String question = "";
		Scanner sc = new Scanner(System.in);
		question = sc.nextLine();
		
		while2 : while(true){ //0.2 while
		if(!(question.equals(" "))){
			if(question.trim().toLowerCase().equals("cpu")){
				CPU_Question();
				break while2;
			}else if(question.toLowerCase().equals("ram")){
				RAM_Question();
				break while2;
			}else if(question.toLowerCase().equals("gpu")){
				GPU_Question();
				break while2;
			}else if(question.toLowerCase().equals("종료")){
				PRINT("종료 되었습니다.");
				return;
			}else{
				PRINT("잘못 입력하였습니다.");
				break;
			}
		}else{
			PRINT("아무것도 입력하지 않았습니다. 다시 질문을 입력해주세요.");
			break;
		}
		
		} // 0.2 while
	} //0.1 while
		}//questionAnswer()
	public static void GPU_Question(){
		Scanner sc = new Scanner(System.in);
		PRINT("-- 노프팀장 -- : GPU 이 작동하는 방식을 간단하게 얘기해보실래요?");
		PRINT("-- 팀노바_김형근 -- : 그래픽카드가 CPU로부터 받은 정보는 그래픽메모리에 저장됩니다. ");
		PRINT("이 정보를 CPU의 지시에 따라 GPU(영상처리장치, Graphic Processing Unit)에서 영상정보를 바꾸고 다시 그래픽 메모리에 저장합니다.");
		PRINT("즉 GPU는 CPU의 지시에 따라 영상 정보를 만드는 그래픽카드의 CPU이며, 그래픽메모리는 CPU 명령과 GPU가 만든 영상정보를 보관하는 저장소인 셈입니다.");
		PRINT("따라서 GPU 동작속도, 메모리 용량과 속도는 그래픽카드의 성능을 가늠하는 중요한 기준이 됩니다.");
		enter();
		PRINT("-- 노프팀장 -- : GPU와 CPU의 상관관계가 굉장히 중요한데요 ~ 예를 들어 게임을 하는데 프레임이 만족스럽게 나오지 않았을 경우 어떤 것을 업그레이드 해야 하나요?");
		answer = sc.nextLine();
		if(answer.matches(".*해상도.*") && answer.matches(".*프레임.*") && answer.matches(".*한계치.*")){
			enter();
			PRINT("-- 노프팀장 -- : GPU 구매 시 고려해야 할 것들은 무엇이 있나요");
			
			answer = sc.nextLine();
			if(answer.matches(".*코어.*") && answer.matches(".*메모리.*") && answer.matches(".*클럭.*")
				&& answer.matches(".*버스.*") && answer.matches(".*쉐이더.*")
				&& (answer.matches(".*다이렉트.*") || answer.toLowerCase().matches(".*direct.*")) 
				&& answer.toLowerCase().matches(".*open.*") 
				&& (answer.matches(".*스트림.*")|| answer.toLowerCase().matches(".*stream.*"))
				&& answer.toLowerCase().matches(".*agp.*") && answer.toLowerCase().matches(".*pci.*")
			){
				PRINT("-- 노프팀장 -- : 간단하게 각각 얘기해보실래요?");
				try {
					enter();
					Thread.sleep(1000);
					PRINT("-- 팀노바_김형근 -- : 1. 코어 클럭 (단위 : Mhz, 고) ");
					PRINT("					코어는 컴퓨터의 CPU와 같은 역할을 합니다. 컴퓨터 CPU클럭이 높을 수록 연산이 빠른 것 처럼 코어클럭이 빠르면 빠를 수록 그래픽연산의 속도가 빨라져 그래픽카드의 성능이 좋아집니다.");
					Thread.sleep(1000);
					enter();
					PRINT("-- 팀노바_김형근 -- : 2. 메모리 클럭 (단위 : Mhz, 고)");
					PRINT("					그래픽카드에 달려있는 메모리의 데이터 처리속도 입니다. 이 메모리 클럭 속도가 높으면 높을 수록 데이터 전송 속도가 높아져 그래픽 카드 성능이 좋아집니다.");
					Thread.sleep(1000);
					enter();
					PRINT("-- 팀노바_김형근 -- : 3. 메모리 용량 (단위 : MB, 고)");
					PRINT("					그래픽 메모리 용량입니다. 메모리 용량과 그래픽 카드의 성능이 직접적으로 관련은 없지만 용량이 많으면 많을 수록 많은 양의 데이터를 저장하고 있다가 GPU(그래픽연산 장치)의 처리 없이 바로 데이터를 전송할 수 있기 때문에 좀 더 빠른 그래픽 처리가 가능해 집니다.");
					Thread.sleep(1000);
					enter();
					PRINT("-- 팀노바_김형근 -- : 4. 메모리 버스 (단위 : bit, 고)");
					PRINT("					그래픽 데이터를 처리할때 얼마나 많은 양의 데이터를 한꺼번에 처리할 수 있나를 나타냅니다. 메모리버스가 크면 클 수록 한꺼번에 많은 량의 데이터를 처리하여 성능이 좋아집니다. ");
					PRINT("-- 팀노바_김형근 -- : 5. 쉐이더 클럭 (단위 : MHz, 고)");
					PRINT("쉐이더 (Shader)라는 것은 빛을 반사한다거나 수면을 진짜같이 움직이게 하는 3D 그래픽 효과 입니다.");
					PRINT("예전에는 그래픽카드의 성능이나 게임엔진의 여건이 좋지않아 많이 쓰이지 않았지만, 요즘 게임은 쉐이더 효과를 많이 쓰고 있습니다.");
					PRINT("쉐이더 클럭이 높으면 높을 수록 쉐이더의 처리가 빨라져 그래픽카드의 성능이 좋아집니다.");
					Thread.sleep(1000);
					enter();
					PRINT("-- 팀노바_김형근 -- : 6. 다이렉트X, OpenGL (고)");
					PRINT("그래픽 명령어라고 보시면 됩니다. 3D게임과 그래픽 카드 사이에서 컴퓨터의 CPU가 명령어가 서로 전달이 될 수 있도록 하는데, 그 명령어 전달방식에 다이렉트X와 OpenGL가 있습니다.");
					PRINT("요즘은 다이렉트X가 표준격으로 쓰이고 있고 OpenGL방식은 몇몇 게임과 그래픽 소프트웨어에서 쓰이고 있습니다.");
					PRINT("다이렉트X와 OpenGL의 버전이 높으면 높을 수록 그래픽 처리 명령어의 전달 속도가 높아져 성능이 향상 됩니다. ");
					Thread.sleep(1000);
					enter();
					PRINT("-- 팀노바_김형근 -- : 7. 스트림 프로세서 (Stream Processor, 단위 : 개, 고)");
					PRINT("그래픽 데이터의 흐름을 처리하는 장치입니다. 예전에는 픽셀 파이프라인이라는 것과 쉐이더 파이프라인이라는 것이 따로 떨어져 있었는데 이 두개가 합쳐진 것이라고 보면 됩니다.");
					PRINT("스트림 프로세서가 많으면 많을 수록, 버전이 높으면 높을 수록 그래픽 처리의 속도가 높아져 성능이 향상 됩니다. ");
					Thread.sleep(1000);
					enter();
					PRINT("-- 팀노바_김형근 -- : 8. AGP x8, PCI-Express x16");
					PRINT("그래픽카드와 3D 게임 사이에 (그냥 3D 게임이라고 표현 하겠습니다) 그래픽 데이터를 주고 받는 통로를 말합니다. 6번 다이렉트X 설명을 하면서 그래픽카드와 3D 게임 사이에 데이터가 왔다갔다 한다고 설명을 했는데요. 그 데이터가 움직이는 통로라고 생각하시면 됩니다.");
					PRINT("AGP 8배속 보다는 PCI-Express 16배속이 더 빠릅니다 ");
					Thread.sleep(1000);
					enter();
					PRINT("-- 노프 팀장 -- : 그래서 갤럭시 GALAX 지포스 GTX750 Ti OC D5 1GB 고르게 된 이유가 뭐에요?");
					Thread.sleep(1000);
					PRINT("-- 팀노바_김형근 -- : 그래픽을 크게 중요시 하는 작업을 하는게 아닌 코딩용이기 때문에 GTX 중상급 사양(3dmark bench 기준 69위 성능)과 10만원 초반 대에 모니터 3대이상 출력이 되는 것을 원했습니다.");
					Thread.sleep(1000);
					PRINT("-- 팀노바_김형근 -- : 그렇기 때문에 갤럭시 GALAX 지포스 GTX750 Ti OC D5 1GB 고르게 되었습니다. ");
					enter();
					PRINT("-- 노프 팀장 -- : 알겠습니다. 수고했어요~");
					enter();
					PRINT("-- 팀노바_김형근 -- : 후훟.... 다행이군..... ㅎ");
					return;

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}else{
				PRINT("-- 노프 팀장 -- : GPU를 구매할 분이 GPU에 대해서 모르면 말이 됩니까.. 힘드네요 ..~ 다음~~~");
				return;
			}
		}else{
			PRINT("-- 노프 팀장 -- : GPU&CPU와의 관계성은 일상생활에서 언급되는 문제인데 조사를 안하셨네요. 하.. 다음~~");
			return ;
		}
	}
	
	public static void RAM_Question(){
		Scanner sc = new Scanner(System.in);
		PRINT("-- 노프팀장 -- : RAM 이 작동하는 방식을 알고 계신가요?");
		answer = sc.nextLine();
		PRINT("메인보드 : "+answer.matches(".*메인보드.*"));
		PRINT("데이 : "+answer.matches(".*데이터.*"));
		PRINT("행  : "+answer.matches(".*행.*"));
		PRINT("열 : "+answer.matches(".*열.*"));
		PRINT("메인보드 : "+answer.matches(".*메인보드.*"));
		PRINT("메인보드 : "+answer.matches(".*메인보드.*"));
		PRINT("메인보드 : "+answer.matches(".*메인보드.*"));
		PRINT("메인보드 : "+answer.matches(".*메인보드.*"));
		PRINT("메인보드 : "+answer.matches(".*메인보드.*"));
		PRINT("메인보드 : "+answer.matches(".*메인보드.*"));
		
		if(answer.matches(".*메인보드.*") && (answer.toLowerCase().matches(".*data.*") || answer.matches(".*데이터.*")) 
			&& (answer.toLowerCase().matches(".*row.*") || answer.matches(".*행.*")) 
			&& (answer.toLowerCase().matches(".*column.*") || answer.matches(".*열.*"))
			&& (answer.matches(".*센스 엠프.*") && answer.toLowerCase().matches(".*ras.*") && answer.toLowerCase().matches(".*cas.*"))
				){
			PRINT("-- 노프팀장 -- : 알겠습니다.");
			enter();
			PRINT("-- 노프팀장 -- : 그럼 RAM을 16G 선택하셨는데요 왜 8G는 안되는지 이유를 설명해주세요. >_+");
			answer = sc.nextLine();
			if(answer.matches(".*측정.*")){
				PRINT("-- 팀노바_김형근 -- : RAM은 다음과 같이 측정 되었습니다.");
				enter();
				try {
					Thread.sleep(1000);
					PRINT("-- 팀노바_김형근 -- : Eclipse = 300~500MB");
					Thread.sleep(1000);
					PRINT("-- 팀노바_김형근 -- : Android Studio = 850MB~1.19GB");
					Thread.sleep(1000);
					PRINT("-- 팀노바_김형근 -- : Android Studio(Emulator) = 850MB~1.19GB");
					Thread.sleep(1000);
					PRINT("-- 팀노바_김형근 -- : Safari(창 10개이상) = 500MB~1.3GB");
					Thread.sleep(1000);
					PRINT("-- 팀노바_김형근 -- : Total(Background Program포함) = 6.71GB");
					Thread.sleep(1000);
					PRINT("-- 팀노바_김형근 -- : 여기에 추가로 VMware 같은 가상 운영체제 프로그램을 돌리면 8G는 부족하다고 생각하여 16G를 선택하게 되었습니다.");
					Thread.sleep(1000);
					PRINT("-- 노프팀장 -- : 알겠습니다~ ");
					enter();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}else{
				PRINT("-- 노프팀장 -- : RAM 16G 선택하셨으면 그 논리를 설명하기 위해 프로그램을 직접 돌려보고 피부로 와 닿게 설명하셔야죠 ~ 하.. 다음~~");
				return;
			}
		}else{
			PRINT("-- 노프팀장 -- : RAM은 프로그래밍과 가장 관련이 많이 되있는 하드웨어 중 하나인데 동작원리를 모르면 이 과제 왜하나요? 힘들다... 다음~~");
			return;
		}

		
		
	}
	
	
	public static void CPU_Question(){
		Scanner sc = new Scanner(System.in);
		//String answer="";
		
		
		while3 : while(true){ //0.3 while
		PRINT("-- 노프팀장 -- : CPU의 동작 원리가 어떻게 되죠 ?");
		answer = sc.nextLine();
		if(!(answer.equals("")) &&!(answer.equals(" "))){
			if(
				  // CPU 동작 원리에 반드시 포함되야 하는 단어
			      // [(인출 AND 디코드 AND 제어 AND 실행)]		
			      (answer.contains("인출") || answer.toLowerCase().contains("fetch")) && (answer.contains("디코드") || answer.toLowerCase().contains("decode")) && 
			      (answer.contains("제어") || answer.toLowerCase().contains("control")) && (answer.contains("실행") || answer.toLowerCase().contains("execution") || (answer.contains("수행")))
			  ){ //1.1 CPU 동작 원리 올바르게 대답할 경우.
				if((answer.trim().contains("프론트엔드") || answer.toLowerCase().contains("frontend") || answer.toLowerCase().contains("front-end")) 
					|| (answer.trim().contains("백엔드") || answer.toLowerCase().contains("backend") || answer.toLowerCase().contains("back-end"))
		          ){  // 1.2 부분적으로 포함되어야 할 단어 
				      // (프론트엔드) OR (백엔드) 언급한 경우
					if(!(answer.trim().matches(".*back-end는 실행.*")) && !(answer.trim().matches(".*backend는 실행.*")) && !(answer.trim().matches(".*백엔드는 실행.*"))){
						PRINT("-- 노프팀장 -- : 프론트엔드와 백엔드를 정확하게 구별하지 못하시네요. 볼 것도 없습니다. 다음~");
						return;
					}
						while4 : while(true){ //0.4 while
				   		PRINT("-- 노프팀장 -- : front-end와 back-end 중 CPU의 성능은 어디서 결정 되나요?");
				   		answer = sc.nextLine();
								if(!(answer.equals("")) && !(answer.equals(" "))){  //0.4번 while if1
									//답변이 짧을 때
									if(answer.length() <= 18){
										if(answer.toLowerCase().matches(".*front.*") || answer.matches(".*프론트.*")){
											pass_num++;
											PRINT("-- 노프팀장 -- : 다음 질문 할께요~");
											PRINT("pass_num : "+pass_num);
									    }else{
									    	pass_num--;
									    	PRINT("-- 노프팀장 -- : 준비가 아직 미흡하시네요..? 대부분 back-end가 실행을 하여 성능을 결정한다고 착각하나 CPU가 읽어들인 명령어가 가장 많이 시간을 보내는 곳이 front-end의 디코드 단계이기 때문에 front-end에서 성능차이가 나게 되요~");
									    	PRINT("-- 노프팀장 -- : 다시 한 번 기회 드릴게요~");
									    	PRINT("pass_num : "+pass_num);
									    }
									//답변이 길 때 	
						   		  	}else{
						   		  		if(!(answer.contains("백엔드에서") || answer.toLowerCase().contains("back-end에서") || answer.toLowerCase().contains("backend에서")) && !(answer.toLowerCase().matches(".*front.*") || answer.matches(".*프론트.*"))){
						   		  			pass_num--;
						   		  			PRINT("-- 노프팀장 -- : 준비가 아직 미흡하시네요..? 대부분 back-end가 실행을 하여 성능을 결정한다고 착각하나 CPU가 읽어들인 명령어가 가장 많이 시간을 보내는 곳이 front-end의 디코드 단계이기 때문에 front-end에서 성능차이가 나게 되요~");
						   		  			PRINT("-- 노프팀장 -- : 다시 한 번 기회 드릴게요~");
						   		  			PRINT("pass_num : "+pass_num);
						   		  		}else if((answer.toLowerCase().matches(".*front.*") || answer.matches(".*프론트.*"))){
						   		  			pass_num++;
						   		  			PRINT("-- 노프팀장 -- : 다음 질문 할께요~");
						   		  			PRINT("pass_num : "+pass_num);

						   		  			}
						   		  	}
									//0.4번 while if1 마지막 줄
									if(!(CPU_Question_select())){
										//CPU_Question exit;
										break while3;
									}
									enter();
									PRINT("-- 팀노바_김형근 -- : 후후...타임머신은 성공적이였어 후후후후훟ㅎ...");
									enter();
									return;
							   }else{
					   		  		PRINT("성능이 어디서 결정 되는지 답변 안해주셨습니다. 다시 입력해주세요.");
							   }
				   			PRINT("1");
						} //0.4 while
							
			   	  	}else{
			   	  		// 1.3 동작 원리는 제대로 설명 했지만
			   	  		// 프론트엔드 백엔드 언급하지 않은 경우
			   		    String front_end_answer, back_end_answer = "";
			   		   	PRINT("-- 노프팀장 -- : front-end와 back-end에 대해 설명해주시겠어요? (답변 순서 : front-end에 대해 입력, enter 누르고 back-end에 대해 답변)");
			   		   	front_end_answer = sc.nextLine();
			   		   	back_end_answer = sc.nextLine();
			   		   	if((front_end_answer.contains("인출") || front_end_answer.toLowerCase().contains("fetch")) && (front_end_answer.contains("디코드") || front_end_answer.toLowerCase().contains("decode")) && 
						   (front_end_answer.contains("제어") || front_end_answer.toLowerCase().contains("control")) && (back_end_answer.contains("실행") || back_end_answer.toLowerCase().contains("execution") || (back_end_answer.contains("수행")))
						  ){ //1.4 프론트엔드 백엔드 구분지어 설명할 경우
			   		   			if(front_end_answer.contains("성능")){ 
			   		   				//프론트 엔드에 성능에 관한 언급이 있을 경우.
			   		   				
			   		   				pass_num++;
			   		   				PRINT("-- 노프팀장 -- : 다음 질문 할게요~");
			   		   				PRINT("pass_num : "+pass_num);

			   		   			}else if(back_end_answer.contains("성능")){ 
			   		   				//백엔드에서 성능이 결정된다고 잘못 언급할 경우. 
			   		   				pass_num--;
			   		   				PRINT("-- 노프팀장 -- : 성능은 back-end에서 결정나는 것이 아닌 front-end에서 결정이 납니다. ");
			   		   				PRINT("pass_num : "+pass_num);
			   		   				break while3;
			   		   			}else{ //1.7 프론트엔드 백엔드 설명 하였으나 성능이 어디서 결정나는지 언급 안했을 경우
			   		   			while4 : while(true){ //0.4 while
							   		PRINT("-- 노프팀장 -- : front-end와 back-end 중 CPU의 성능은 어디서 결정 되나요?");
							   		answer = sc.nextLine();
											if(!(answer.equals("")) && !(answer.equals(" "))){  //0.4번 while if1
												//답변이 짧을 때
												if(answer.length() <= 18){
													if(answer.toLowerCase().matches(".*front.*") || answer.matches(".*프론트.*")){
														pass_num++;
														PRINT("-- 노프팀장 -- : 다음 질문 할께요~");
														PRINT("pass_num : "+pass_num);
												    }else{
												    	pass_num--;
												    	PRINT("-- 노프팀장 -- : 준비가 아직 미흡하시네요..? 대부분 back-end가 실행을 하여 성능을 결정한다고 착각하나 CPU가 읽어들인 명령어가 가장 많이 시간을 보내는 곳이 front-end의 디코드 단계이기 때문에 front-end에서 성능차이가 나게 되요~");
												    	PRINT("-- 노프팀장 -- : 다시 한 번 기회 드릴게요~");
												    	PRINT("pass_num : "+pass_num);
												    }
												//답변이 길 때 	
									   		  	}else{
									   		  		if(!(answer.contains("백엔드에서") || answer.toLowerCase().contains("back-end에서") || answer.toLowerCase().contains("backend에서")) && !(answer.toLowerCase().matches(".*front.*") || answer.matches(".*프론트.*"))){
									   		  			pass_num--;
									   		  			PRINT("-- 노프팀장 -- : 준비가 아직 미흡하시네요..? 대부분 back-end가 실행을 하여 성능을 결정한다고 착각하나 CPU가 읽어들인 명령어가 가장 많이 시간을 보내는 곳이 front-end의 디코드 단계이기 때문에 front-end에서 성능차이가 나게 되요~");
									   		  			PRINT("-- 노프팀장 -- : 다시 한 번 기회 드릴게요~");
									   		  			PRINT("pass_num : "+pass_num);
									   		  		}else if((answer.toLowerCase().matches(".*front.*") || answer.matches(".*프론트.*"))){
									   		  			pass_num++;
									   		  			PRINT("-- 노프팀장 -- : 다음 질문 할께요~");
									   		  			PRINT("pass_num : "+pass_num);

									   		  			}
									   		  	}
												//0.4번 while if1 마지막 줄
												if(!(CPU_Question_select())){
													//CPU_Question exit;
													break while3;
												}
												enter();
												PRINT("-- 팀노바_김형근 -- : 후후...타임머신은 성공적이였어 후후후후훟ㅎ...");
												enter();
												return;
										   }else{
								   		  		PRINT("성능이 어디서 결정 되는지 답변 안해주셨습니다. 다시 입력해주세요.");
										   }
							   			PRINT("1");
									} //0.4 while
			   		   			} //1.7
			   		   			PRINT("수고했");
			   		   	    } //1.4
			   		   		else{
			   		   			PRINT("-- 노프팀장 -- : front-end와 back-end는 CPU 동작 원리에 대해서 조사를 깊게 했다면 아실 수 있는 내용인데 대충 조사하였네요?~");
			   		   		}
			   		   	 PRINT("3");
			   		   	 return;
			   	   	} //1.3
				
				
			   //PRINT("4");
		    }else{ //1.1.1 CPU 동작 원리 올바르게 대답하지 못했을 경우
			PRINT("-- 노프팀장 -- : 여러분 이렇게 과제 하시면 안되요. 팀노바 얼마나 우습게 봤으면... 적어도 5시간이 하루에 5시간씩 하라는게 아니에요. 최소에요 최소! 다 짜응나니까 환불하고 나가세요. 저는 열심히 하는 소수정예만 이끌고 싶습니다~~~");
			PRINT("5");
			return;
		    }// 1.1.1
		}else{
			PRINT("CPU 동작 원리에 대해 설명하지 않았습니다. 입력을 해주세요.");
			PRINT("6");
		}
		// PRINT("7");
	}//0.3
		PRINT("8");
	}
	
	
	public static boolean CPU_Question_select(){
		PRINT("-- 노프팀장 -- : CPU를 선택해야 하는 단계에서 필요한 요소가 뭐죠?");
		Scanner sc  = new Scanner(System.in);
		answer = sc.nextLine();
			if(answer.contains("제조사") && answer.toLowerCase().trim().contains("코어") && answer.toLowerCase().trim().contains("소켓") && answer.toLowerCase().trim().contains("클럭") && answer.toLowerCase().trim().contains("캐시")){
				pass_num++;
				PRINT("-- 노프팀장 -- : 각각에 대해 어떤 것을 고려해야 하는지 설명해볼래요? ");
				PRINT("pass_num : "+pass_num);
				//full_pass_num : 2
				String consider_element[] = new String[5];
				for(int i=0; i<5; i++){
					//노프팀장님의 컨디션에 따라 질문의 갯수가 달라짐 --> 랜덤
					//3 <=  3,4,5,6,7  <8
					int nova_num=(int)(Math.random()*5)+3;
					PRINT("nova_num: "+nova_num);
					if(pass_num >= nova_num){
						PRINT("-- 노프팀장 -- : 알겠어요 ~~ 그럼~~~~보자~~ 잠시만요~~~");
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						break;
					}
					consider_element[i] = sc.nextLine();
					if(consider_element[i].contains("제조사")){
						if(duplicateCheck(i,consider_element)){ i--; continue;}
							if(consider_element[i].toLowerCase().contains("amd") && (consider_element[i].toLowerCase().contains("intel") || consider_element[i].contains("인텔"))){
								pass_num++;
								PRINT("-- 노프 팀장 -- : 네에~~~(다음)");
							}else{
								PRINT("-- 노프팀장 -- : 부족합니다...");
							}
					}else if(consider_element[i].toLowerCase().trim().contains("코어")){
						if(duplicateCheck(i,consider_element)){ i--; continue;}
							if(consider_element[i].toLowerCase().trim().contains("코어") && (consider_element[i].toLowerCase().trim().contains("architecture") || consider_element[i].contains("아키텍처")) && (consider_element[i].contains("고려") || consider_element[i].contains("참고"))){
								pass_num++;
								PRINT("-- 노프 팀장 -- : 네에~~~(다음)");
							}else{
								PRINT("-- 노프팀장 -- : 부족합니다...");
							}
					}else if(consider_element[i].toLowerCase().trim().contains("소켓")){
						if(duplicateCheck(i,consider_element)){ i--; continue;}
							if((consider_element[i].matches(".*맞.*") || consider_element[i].matches(".*호환.*")) && consider_element[i].contains("메인보드")){
								pass_num++;
								PRINT("-- 노프 팀장 -- : 네에~~~(다음)");
							}else{
								PRINT("pass_num : "+pass_num);
								PRINT("-- 노프팀장 -- : 부족합니다...");
							}
					}else if(consider_element[i].toLowerCase().trim().contains("클럭")){
						if(duplicateCheck(i,consider_element)){ i--; continue;}
							if((consider_element[i].matches(".*높.*") || consider_element[i].matches(".*좋.*")) && consider_element[i].matches(".*다.*")){
								pass_num++;
								PRINT("-- 노프 팀장 -- : 네에~~~(다음)");
							}else{
								PRINT("pass_num : "+pass_num);
								PRINT("-- 노프팀장 -- : 부족합니다...");
							}
					}else{
						if(duplicateCheck(i,consider_element)){ i--; continue;}
							if((consider_element[i].matches(".*크.*") || consider_element[i].matches(".*높.*") || consider_element[i].matches(".*많.*")) && (consider_element[i].trim().matches(".*좋.*") || consider_element[i].trim().contains(".*비싸.*"))){
								pass_num++;
								PRINT("-- 노프 팀장 -- : 네에~~~(다음)");
							}else{
								PRINT("pass_num : "+pass_num);
								PRINT("-- 노프팀장 -- : 부족합니다...");
							}
					}
				}//cpu_select_for문
				
				if(pass_num <=2){
					PRINT("-- 노프팀장 -- : CPU에 대해서 선택하는데 있어 전체적으로 고려사항을 모르네요. 준비를 하다 말았습니다. 휴...");
					return false;
				}else{
					//pass_num : 3~7
					PRINT("-- 노프팀장 -- : CPU를 인텔 코어i5-6세대 6400 (스카이레이크)로 선택 했는데 왜 코딩용으로 선택 하신거죠?");
					enter();
					if(!(CPU_Question_performance())){
						PRINT("-- 노프팀장 -- : CPU에 대해 조사는 했지만 여러분 팀노바를 너무 무시했네요. 다들 benchmark 제대로 조사 하지도 않았어요! 단체이월...흠....");
						return false;
					}
					return true;
				}
				
				
			}else{
				pass_num--;
				PRINT("pass_num : "+pass_num);
				PRINT("-- 노프팀장 -- : 여러분 뭐하시는거에요 지금~~~~. 하루에 몇시간 했어요?");
				answer = sc.nextLine();
				if(answer.matches(".*1.*") ||answer.matches(".*2.*") ||answer.matches(".*3.*") || answer.matches(".*4.*") || answer.matches(".*5.*") ||answer.contains(".*6.*")){
					PRINT("-- 노프팀장 -- : 우리 못 속인다니깐요? 다 들통나요 여러분....최소 5시간이 어쩔 수 없을 때 5시간이지 평소는 10시간이상입니다... 하.. 힘들다.. 다음~");
				}else if(answer.matches(".*7.*") ||answer.matches(".*8.*") || answer.matches(".*9.*")  || answer.matches(".*10.*")|| answer.matches(".*11.*")|| answer.matches(".*12.*")){
					PRINT("-- 노프팀장 -- : 여러분...시간을 스마트하게 써야죠.. 노력만 하면 다입니까? 잘해야합니다... 모르면 물어보러 평일에도 나오세요~! 하... 다음~");
				}else{
					PRINT("-- 노프팀장 -- : 추상적으로 말하지 마세요... 변명하지 말고 그냥 열심히 안했다고 하세요. 하.. 다음~ ");
				}
			}
		//break while3;
			return false;
	}
	
	
	public static boolean CPU_Question_performance() {
		Scanner sc = new Scanner(System.in);
		try {
			Thread.sleep(1000);PRINT("-- 팀노바_김형근 -- : 우선 CPU를 선택할 때 Intel과 Amd를 비교하였습니다.");
			PRINT("-- 팀노바_김형근 -- : 간략하게 제조사에 따른 CPU를 언급하고 넘어가겠습니다. ");
			enter();
			Thread.sleep(1000);
			PRINT("-- 팀노바_김형근 -- : Intel_특징 : Intel의 cpu는 널리 사용되고, 하에엔드 cpu시장에서 독점할 만큼 성능이 뛰어나지만 비쌉니다.");
			PRINT("-- 팀노바_김형근 -- : Intel_성능 확인법 :  예) i5 - 4670K");
			PRINT("-- 팀노바_김형근 -- : i5 : 제품군에 해당합니다. 대표적으로 i3, i5, i7이 있습니다. ");
			PRINT("-- 팀노바_김형근 -- : 천의자리 : 세대를 뜻합니다. 위의 예시를 보면 4세대 CPU로 알 수 있습니다. (단, 하이엔드 및 익스트림 프로세서 제품군은 여기에 +1정도 하시면 이해하기 수월합니다.) ");
			PRINT("-- 팀노바_김형근 -- : 백,십의 자리: 성능을 뜻합니다. 숫자가 클수록 성능이 좋으나, 경우에 따라 아닌 경우도 있습니다. (백의 자리가 8,9인 제품은 하이엔드 및 익스트림 프로세서 제품입니다.)");
			PRINT("-- 팀노바_김형근 -- : 1의 자리 : CPU의 특성을 뜻합니다. 1의 자리가 '0'이 아니면 전부 노트북용 CPU입니다. ");
			PRINT("-- 팀노바_김형근 -- : 추가로 K, X가 붙은 제품이 있습니다. K는 경우에 따라 하이엔드 제품군, 오버클럭용 CPU에 붙습니다. X는 익스트림 제품군, 쿼드코어 이상, 배수락 제한 없음을 뜻합니다. ");
			enter();
			Thread.sleep(1000);
			PRINT("-- 팀노바_김형근 -- : AMD_특징 : AMD는 인텔에 비해 기술이 떨어지지만(코어 당 성능이 떨어짐) 가격이 저렴합니다. ");
			PRINT("-- 팀노바_김형근 -- : AMD_성능 확인법 : 예) AMD FX 8300 ");
			PRINT("-- 팀노바_김형근 -- : FX : 코드 안에 서의 브랜드 ");
			PRINT("-- 팀노바_김형근 -- : 천의자리 : 같은 코드 안에서 높은 숫자가 좋음 ");
			PRINT("-- 팀노바_김형근 -- : 백의자리 : 세부성능 (높은 숫자일수록 좋음) ");
			PRINT("-- 팀노바_김형근 -- : 비쉐라 : 코드네임(파일드라이버 안에서 높은 숫자가 좋음) ");
			enter();
			Thread.sleep(3000);
			PRINT("-- 팀노바_김형근 -- : 가격은 20만원 내외로 정했고 최소 4쓰레드 이상으로 기준을 정해 다음과 같은 두 제품을 선정하였습니다.");
			PRINT("-- 팀노바_김형근 -- : Intel i5-6400 vs AMD FX-8300 ");
			enter();
			Thread.sleep(1000);
			PRINT("-- 팀노바_김형근 -- : 여기서 CPU의 성능을 비교해보기 위해 benchmark를 이용하여 성능 비교를 하였습니다. ");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		PRINT("-- 노프팀장 -- : 잠시만요~ 두 제품을 선택했고 비교를 위해서 benchmark를 보셨다고 했잖아요? 혹시 몇개의 benchmark를 이용했죠?");
		PRINT("(숫자만 입력해주세요)");
		int bench_total= 0;
		bench_total = sc.nextInt();
		
		if(!(CPU_Question_benchmark(bench_total))){
			PRINT("-- 노프팀장 -- : 여러분~ 기본적으로 CPU 성능을 조사했다고 하면 benchmark를 보고 오실텐데 ~ 어떻게 측정했고 신뢰할 수 있는 값인지 알아 보는 건 기본이잖아요~ 주장이 아니라 객관적 자료를 근거로하여 내 논리를 극대화 시켜야 합니다. ");
			return false;
		}
		
		switch(bench_total){
		case 1:
			if(pass_num >=4 && pass_num <9){
				PRINT("-- 노프팀장 -- : 그래도 준비 좀 하셨네요~ ");
				break;
			}
		case 2:
			if(pass_num >=5 && pass_num <10){
				PRINT("-- 노프팀장 -- : 그래도 준비 좀 하셨네요~ ");
				break;
			}
		case 3:
			if(pass_num >=6 && pass_num <11){
				PRINT("-- 노프팀장 -- : 그럼 마지막으로 인텔과 AMD의 차이점을 설명하면서 결론을 내려보실래요?");
				try {
					Thread.sleep(1000);
					PRINT("-- 팀노바_김형근 : 인텔은 직렬(SMT) / AMD 는 병렬(CMT)");
					enter();
					Thread.sleep(1000);
					PRINT("-- 팀노바_김형근 : 인텔은 하이퍼스레딩 기술을 가지고 있어 코어를 일관성 있게 계속 불려 왔음(1core 2Thread)");
					Thread.sleep(1000);
					PRINT("-- 팀노바_김형근 : 인텔 SMT는 강력한 단일 스레드 성능을 제공하고, 남는 빈틈을 사용하는 추가적인 스레드를 만들어 병렬성을 추구함.( 어느 방향으로도 강력한 단일 스레드 성능을 제공할 수 있으나, 사용량이 전체의 50%로 표기될 때 CPU는 이미 100% 로드된 상태이고 로드가 높아졌을 때, 즉 과부하 상태일 때 유연성이 떨어진다는 단점이 있음)");
					Thread.sleep(1000);
					PRINT("-- 팀노바_김형근 : AMD는 큰 코어의 절반을 나누고 클러스터 코어(CMT) 즉 모듈이라고 명명함. (1core 1Thread)");
					Thread.sleep(1000);
					PRINT("-- 팀노바_김형근 : 작동 양상의 차이점은 CMT는 물리적으로 '병렬화' 되어진 구조이기 때문에, 단기간 작업속도는 직렬인 인텔 SMT보다 느릴 수 밖에 없음.");
					Thread.sleep(1000);
					PRINT("-- 팀노바_김형근 : 고부하 작업 에서의 안전성과 작업 총량은 단연 CMT가 우세함.");
					Thread.sleep(1000);
					PRINT("-- 팀노바_김형근 : AMD 8300 은 가성비는 괜찮('병렬성' CPU 코어가 많고 3.3Ghz로 가장 클럭이 낮은 라인업), 오버클럭이 잘됨 ");
					Thread.sleep(1000);
					PRINT("-- 팀노바_김형근 : 저는 코딩용으로 적합한 CPU를 고르는 것이기 때문에 계속적인 고부하 작업 ((예)게임)이 아닌 코딩 시 단기간 빠르게 작동하는 것을 원하기 때문에 강력한 단일 스레드를 제공하는 인텔 i5-6400을 선택하게 되었습니다. ");
					Thread.sleep(1000);
					enter();
					PRINT("-- 노프팀장 -- : 흠 알겠습니다. 잘했어요~ ");

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
			}
		}
		return true;
	}
	
	
	public static boolean CPU_Question_benchmark(int i){
		Scanner sc = new Scanner(System.in);
		if(i<=1){
			String benchmark1 = "";
			int benchmark1_num = 0;
			PRINT("-- 노프팀장 -- : 그럼 하나 조사한 benchmark 명과 측정 방법에 대해서 설명해 주시겠어요?");
			benchmark1 = sc.nextLine();
			if(benchmark1.toLowerCase().matches(".*cinebench.*") && (benchmark1.toLowerCase().matches(".*rendering.*") || benchmark1.matches(".*렌더링.*")|| benchmark1.matches(".*랜더링.*"))){
				PRINT("-- 노프팀장 -- : 조사는 하셨네요~ 그렇지만 2개이상 정도로 조사해서 더 객관화 시키는 것이 좋을 것 같네요~.");
				PRINT("-- 팀노바_김형근 -- : 네 알겠습니다~ 그래서 조사한 결과로는 아래와 같습니다.");
				PRINT("-- 팀노바_김형근 -- : Cinebench R11.5, 64bit(Single-Core)");
				PRINT("-- 팀노바_김형근 -- : AMD FX-8300 : 1.11");
				PRINT("-- 팀노바_김형근 -- : Intel Core i5-6400 : 1.68");
				enter();
				PRINT("-- 팀노바_김형근 -- : Cinebench R11.5, 64bit(Multi-Core)");
				PRINT("-- 팀노바_김형근 -- : AMD FX-8300 : 6.77");
				PRINT("-- 팀노바_김형근 -- : Intel Core i5-6400 : 5.42");
				enter();
				PRINT("-- 팀노바_김형근 -- : Cinebench R15 (Single-Core)");
				PRINT("-- 팀노바_김형근 -- : AMD FX-8300 : 96");
				PRINT("-- 팀노바_김형근 -- : Intel Core i5-6400 : 140");
				enter();
				PRINT("-- 팀노바_김형근 -- : Cinebench R15 (Multi-Core)");
				PRINT("-- 팀노바_김형근 -- : AMD FX-8300 : 649");
				PRINT("-- 팀노바_김형근 -- : Intel Core i5-6400 : 497");
				enter();
				benchmark1_num ++;
				pass_num++;
				if(benchmark1_num >= 1 && benchmark1_num<2){
					return true;
				}
			}else if(benchmark1.toLowerCase().matches(".*3dmark.*") && benchmark1.toLowerCase().matches(".*direct3d.*")){
				PRINT("-- 노프팀장 -- : 조사는 하셨네요~ 그렇지만 2개이상 정도로 조사해서 더 객관화 시키는 것이 좋을 것 같네요~.");
				PRINT("-- 팀노바_김형근 -- : 네 알겠습니다~ 그래서 조사한 결과로는 아래와 같습니다.");
				PRINT("-- 팀노바_김형근 -- : 3dmark");
				PRINT("-- 팀노바_김형근 -- : AMD FX-8300 : 5650");
				PRINT("-- 팀노바_김형근 -- : Intel Core i5-6400 : 6100");
				enter();
				benchmark1_num ++;
				pass_num++;
				if(benchmark1_num >= 1 && benchmark1_num<2){
					return true;
				}
			}else if(benchmark1.toLowerCase().matches(".*geek.*") && benchmark1.toLowerCase().contains("jpg") 
					&& benchmark1.toLowerCase().contains("png")  
					&& (benchmark1.toLowerCase().contains("decoding") || benchmark1.matches(".*디코딩.*")) 
					&& (benchmark1.toLowerCase().contains("sha512") || benchmark1.toLowerCase().contains("twofish") || benchmark1.toLowerCase().contains("암호화")) 
					&& (benchmark1.toLowerCase().contains("bzip") || benchmark1.toLowerCase().contains("압축"))){
				PRINT("-- 노프팀장 -- : 조사는 하셨네요~ 그렇지만 2개이상 정도로 조사해서 더 객관화 시키는 것이 좋을 것 같네요~.");
				PRINT("-- 팀노바_김형근 -- : 네 알겠습니다~ 그래서 조사한 결과로는 아래와 같습니다.");
				PRINT("-- 팀노바_김형근 -- : Geekbench Browser, 32bit(Single-Core)");
				PRINT("-- 팀노바_김형근 -- : AMD FX-8300 : 1972");
				PRINT("-- 팀노바_김형근 -- : Intel Core i5-6400 : 3237");
				enter();
				PRINT("-- 팀노바_김형근 -- : Geekbench Browser, 32bit(Multi-Core)");
				PRINT("-- 팀노바_김형근 -- : AMD FX-8300 : 9143");
				PRINT("-- 팀노바_김형근 -- : Intel Core i5-6400 : 10084");
				enter();
				PRINT("-- 팀노바_김형근 -- : Geekbench Browser, 64bit(Single-Core)");
				PRINT("-- 팀노바_김형근 -- : AMD FX-8300 : 2186");
				PRINT("-- 팀노바_김형근 -- : Intel Core i5-6400 : 3405");
				enter();
				PRINT("-- 팀노바_김형근 -- : Geekbench Browser, 64bit(Multi-Core)");
				PRINT("-- 팀노바_김형근 -- : AMD FX-8300 : 10599");
				PRINT("-- 팀노바_김형근 -- : Intel Core i5-6400 : 10618");
				enter();
				benchmark1_num ++;
				pass_num++;
				if(benchmark1_num >= 1 && benchmark1_num<2){
					return true;
				}
			}
		}else if(i>1 && i<=2){
			PRINT("-- 노프팀장 -- : 그럼 조사한 benchmark 명과 측정 방법에 대해서 설명해 주시겠어요?");
			String benchmark2[] = new String[2];
			int benchmark2_num = 0;
			for(int j=0; j<2; j++){
				if(j==1){
					PRINT("-- 노프팀장 -- : 네~ 그리구요~~");
				}
				benchmark2[j] = sc.nextLine();
				if(benchmark2[j].toLowerCase().matches(".*cinebench.*") && (benchmark2[j].toLowerCase().matches(".*rendering.*") || benchmark2[j].matches(".*렌더링.*")|| benchmark2[j].matches(".*랜더링.*"))){
					PRINT("-- 노프팀장 -- : 네~");
					PRINT("-- 팀노바_김형근 -- : 그래서 조사한 결과로는 아래와 같습니다.");
					PRINT("-- 팀노바_김형근 -- : Cinebench R11.5, 64bit(Single-Core)");
					PRINT("-- 팀노바_김형근 -- : AMD FX-8300 : 1.11");
					PRINT("-- 팀노바_김형근 -- : Intel Core i5-6400 : 1.68");
					enter();
					PRINT("-- 팀노바_김형근 -- : Cinebench R11.5, 64bit(Multi-Core)");
					PRINT("-- 팀노바_김형근 -- : AMD FX-8300 : 6.77");
					PRINT("-- 팀노바_김형근 -- : Intel Core i5-6400 : 5.42");
					enter();
					PRINT("-- 팀노바_김형근 -- : Cinebench R15 (Single-Core)");
					PRINT("-- 팀노바_김형근 -- : AMD FX-8300 : 96");
					PRINT("-- 팀노바_김형근 -- : Intel Core i5-6400 : 140");
					enter();
					PRINT("-- 팀노바_김형근 -- : Cinebench R15 (Multi-Core)");
					PRINT("-- 팀노바_김형근 -- : AMD FX-8300 : 649");
					PRINT("-- 팀노바_김형근 -- : Intel Core i5-6400 : 497");
					enter();
					benchmark2_num ++;
					pass_num++;
					if(benchmark2_num >= 2 && benchmark2_num<3){
						return true;
					}
				}else if(benchmark2[j].toLowerCase().matches(".*3dmark.*") && benchmark2[j].toLowerCase().matches(".*direct3d.*")){
					PRINT("-- 노프팀장 -- : 조사는 하셨네요~ 그렇지만 2개이상 정도로 조사해서 더 객관화 시키는 것이 좋을 것 같네요~.");
					PRINT("-- 팀노바_김형근 -- : 네 알겠습니다~ 그래서 조사한 결과로는 아래와 같습니다.");
					PRINT("-- 팀노바_김형근 -- : 3dmark");
					PRINT("-- 팀노바_김형근 -- : AMD FX-8300 : 5650");
					PRINT("-- 팀노바_김형근 -- : Intel Core i5-6400 : 6100");
					enter();
					benchmark2_num ++;
					pass_num++;
					if(benchmark2_num >= 2 && benchmark2_num<3){
						return true;
					}
				}else if(benchmark2[j].toLowerCase().matches(".*geek.*") && benchmark2[j].toLowerCase().contains("jpg") 
						&& benchmark2[j].toLowerCase().contains("png")  
						&& (benchmark2[j].toLowerCase().contains("decoding") || benchmark2[j].matches(".*디코딩.*")) 
						&& (benchmark2[j].toLowerCase().contains("sha512") || benchmark2[j].toLowerCase().contains("twofish") || benchmark2[j].toLowerCase().contains("암호화")) 
						&& (benchmark2[j].toLowerCase().contains("bzip") || benchmark2[j].toLowerCase().contains("압축"))){
					PRINT("-- 노프팀장 -- : 조사는 하셨네요~ 그렇지만 2개이상 정도로 조사해서 더 객관화 시키는 것이 좋을 것 같네요~.");
					PRINT("-- 팀노바_김형근 -- : 네 알겠습니다~ 그래서 조사한 결과로는 아래와 같습니다.");
					PRINT("-- 팀노바_김형근 -- : Geekbench Browser, 32bit(Single-Core)");
					PRINT("-- 팀노바_김형근 -- : AMD FX-8300 : 1972");
					PRINT("-- 팀노바_김형근 -- : Intel Core i5-6400 : 3237");
					enter();
					PRINT("-- 팀노바_김형근 -- : Geekbench Browser, 32bit(Multi-Core)");
					PRINT("-- 팀노바_김형근 -- : AMD FX-8300 : 9143");
					PRINT("-- 팀노바_김형근 -- : Intel Core i5-6400 : 10084");
					enter();
					PRINT("-- 팀노바_김형근 -- : Geekbench Browser, 64bit(Single-Core)");
					PRINT("-- 팀노바_김형근 -- : AMD FX-8300 : 2186");
					PRINT("-- 팀노바_김형근 -- : Intel Core i5-6400 : 3405");
					enter();
					PRINT("-- 팀노바_김형근 -- : Geekbench Browser, 64bit(Multi-Core)");
					PRINT("-- 팀노바_김형근 -- : AMD FX-8300 : 10599");
					PRINT("-- 팀노바_김형근 -- : Intel Core i5-6400 : 10618");
					enter();
					benchmark2_num ++;
					pass_num++;
					if(benchmark2_num >= 2 && benchmark2_num<3){
						return true;
					}
				}
			}
		}else if(i>2 && i<=3){
			PRINT("-- 노프팀장 -- : 그럼 조사한 benchmark 명과 측정 방법에 대해서 설명해 주시겠어요?");
			String benchmark3[] = new String[3];
			int benchmark3_num = 0;
			for(int j=0; j<3; j++){
				if(j==1 || j==2){
					PRINT("-- 노프팀장 -- : 네~ 그리구요~~");
				}
				benchmark3[j] = sc.nextLine();
				if(benchmark3[j].toLowerCase().matches(".*cinebench.*") && (benchmark3[j].toLowerCase().matches(".*rendering.*") || benchmark3[j].matches(".*렌더링.*")|| benchmark3[j].matches(".*랜더링.*"))){
					PRINT("-- 노프팀장 -- : 네~");
					PRINT("-- 팀노바_김형근 -- : 그래서 조사한 결과로는 아래와 같습니다.");
					PRINT("-- 팀노바_김형근 -- : Cinebench R11.5, 64bit(Single-Core)");
					PRINT("-- 팀노바_김형근 -- : AMD FX-8300 : 1.11");
					PRINT("-- 팀노바_김형근 -- : Intel Core i5-6400 : 1.68");
					enter();
					PRINT("-- 팀노바_김형근 -- : Cinebench R11.5, 64bit(Multi-Core)");
					PRINT("-- 팀노바_김형근 -- : AMD FX-8300 : 6.77");
					PRINT("-- 팀노바_김형근 -- : Intel Core i5-6400 : 5.42");
					enter();
					PRINT("-- 팀노바_김형근 -- : Cinebench R15 (Single-Core)");
					PRINT("-- 팀노바_김형근 -- : AMD FX-8300 : 96");
					PRINT("-- 팀노바_김형근 -- : Intel Core i5-6400 : 140");
					enter();
					PRINT("-- 팀노바_김형근 -- : Cinebench R15 (Multi-Core)");
					PRINT("-- 팀노바_김형근 -- : AMD FX-8300 : 649");
					PRINT("-- 팀노바_김형근 -- : Intel Core i5-6400 : 497");
					enter();
					benchmark3_num ++;
					pass_num++;

					if(benchmark3_num >= 3 && benchmark3_num<4){
						return true;
					}
				}else if(benchmark3[j].toLowerCase().matches(".*3dmark.*") && benchmark3[j].toLowerCase().matches(".*direct3d.*")){
					PRINT("-- 노프팀장 -- : 조사는 하셨네요~ 그렇지만 2개이상 정도로 조사해서 더 객관화 시키는 것이 좋을 것 같네요~.");
					PRINT("-- 팀노바_김형근 -- : 네 알겠습니다~ 그래서 조사한 결과로는 아래와 같습니다.");
					PRINT("-- 팀노바_김형근 -- : 3dmark");
					PRINT("-- 팀노바_김형근 -- : AMD FX-8300 : 5650");
					PRINT("-- 팀노바_김형근 -- : Intel Core i5-6400 : 6100");
					enter();
					benchmark3_num ++;
					pass_num++;

					if(benchmark3_num >= 3 && benchmark3_num<4){
						return true;
					}
				}else if(benchmark3[j].toLowerCase().matches(".*geek.*") && benchmark3[j].toLowerCase().contains("jpg") 
						&& benchmark3[j].toLowerCase().contains("png")  
						&& (benchmark3[j].toLowerCase().contains("decoding") || benchmark3[j].matches(".*디코딩.*")) 
						&& (benchmark3[j].toLowerCase().contains("sha512") || benchmark3[j].toLowerCase().contains("twofish") || benchmark3[j].toLowerCase().contains("암호화")) 
						&& (benchmark3[j].toLowerCase().contains("bzip") || benchmark3[j].toLowerCase().contains("압축"))){
					PRINT("-- 노프팀장 -- : 조사는 하셨네요~ 그렇지만 2개이상 정도로 조사해서 더 객관화 시키는 것이 좋을 것 같네요~.");
					PRINT("-- 팀노바_김형근 -- : 네 알겠습니다~ 그래서 조사한 결과로는 아래와 같습니다.");
					PRINT("-- 팀노바_김형근 -- : Geekbench Browser, 32bit(Single-Core)");
					PRINT("-- 팀노바_김형근 -- : AMD FX-8300 : 1972");
					PRINT("-- 팀노바_김형근 -- : Intel Core i5-6400 : 3237");
					enter();
					PRINT("-- 팀노바_김형근 -- : Geekbench Browser, 32bit(Multi-Core)");
					PRINT("-- 팀노바_김형근 -- : AMD FX-8300 : 9143");
					PRINT("-- 팀노바_김형근 -- : Intel Core i5-6400 : 10084");
					enter();
					PRINT("-- 팀노바_김형근 -- : Geekbench Browser, 64bit(Single-Core)");
					PRINT("-- 팀노바_김형근 -- : AMD FX-8300 : 2186");
					PRINT("-- 팀노바_김형근 -- : Intel Core i5-6400 : 3405");
					enter();
					PRINT("-- 팀노바_김형근 -- : Geekbench Browser, 64bit(Multi-Core)");
					PRINT("-- 팀노바_김형근 -- : AMD FX-8300 : 10599");
					PRINT("-- 팀노바_김형근 -- : Intel Core i5-6400 : 10618");
					enter();
					benchmark3_num ++;
					pass_num++;

					if(benchmark3_num >= 3 && benchmark3_num<4){
						return true;
					}
				}
			}
			
		}else{
			PRINT("-- 노프팀장 -- : 그짓말하구 있네 짜응나니까 다음~ ");
		}
		
		return false;
	}
	
	

	public static boolean duplicateCheck(int i,String[] consider_element){
		for(int j=1; j<i+1; j++){
			if(consider_element[i].matches(".*제조사.*") && consider_element[i-j].matches(".*제조사.*")){
				PRINT("(정답을 중복해서 대답하였습니다. 다른 정답으로 대답하세요.)");
				return true;
			}else if(consider_element[i].matches(".*클럭.*") && consider_element[i-j].matches(".*클럭.*")){
				PRINT("(정답을 중복해서 대답하였습니다. 다른 정답으로 대답하세요.)");
				return true;
			}else if(consider_element[i].matches(".*코어.*") && consider_element[i-j].matches(".*코어.*")){
				PRINT("(정답을 중복해서 대답하였습니다. 다른 정답으로 대답하세요.)");
				return true;
			}else if(consider_element[i].matches(".*캐시메모리.*") && consider_element[i-j].matches(".*캐시메모리.*")){
				PRINT("(정답을 중복해서 대답하였습니다. 다른 정답으로 대답하세요.)");
				return true;
			}else if(consider_element[i].matches(".*소켓.*") && consider_element[i-j].matches(".*소켓.*")){
				PRINT("(정답을 중복해서 대답하였습니다. 다른 정답으로 대답하세요.)");
				return true;
			}
		}
		return false;
	}
	
	
	public static void enter(){
		System.out.println("");
	}
	
	
	public static void PRINT(String str){
		System.out.println(str);
	}
	
	/*AnsiConsole.systemInstall();
	AnsiConsole.out.println("\033[32mHowdy");
	    
	AnsiConsole.systemInstall();
	System.out.println(ansi().fg(RED).a("2017.7.23").reset());
	AnsiConsole.systemUninstall();*/
		
		
		
	}
	



