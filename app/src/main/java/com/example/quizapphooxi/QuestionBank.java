package com.example.quizapphooxi;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {
    private static List<QuestionsList> lichsuquestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Thuận lợi cơ bản nhất của đất nước sau năm 1975 là:", "nhân dân phấn khởi với chiến thắng vừa giành được.","có miền Bắc xã hội chủ nghĩa, miền Nam hoàn toàn giải phóng.","đất nước đã được độc lập, thống nhất."," các nước xã hội chủ nghĩa tiếp tục ủng hộ ta.","đất nước đã được độc lập, thống nhất.","");
        final QuestionsList question2 = new QuestionsList("Khó khăn cơ bản nhất của đất nước ta sau năm 1975 là gì ?", "Số người mù chữ, số người thất nghiệp chiếm tỉ lệ cao."," Bọn phản động trong nước vẫn còn.","Nền kinh tế nông nghiệp vẫn còn lạc hậu.","Hậu quả của chiến tranh và chủ nghĩa thực dân mới Mĩ để lại rất nặng nề.","Số người mù chữ, số người thất nghiệp chiếm tỉ lệ cao","");
        final QuestionsList question3 = new QuestionsList("Nhiệm vụ trọng tâm của miền Bắc ngay sau 1975 là gì?", "Hàn gắn vết thương chiến tranh.","Khắc phục hậu quả chiến tranh, khôi phục và phát triển kinh tế, văn hoá."," Tiếp tục làm nhiệm vụ căn cứ địa của cách mạng cả nước.","Tiếp tục làm nghĩa vụ quốc tế đối với Lào và Campuchia.","Khắc phục hậu quả chiến tranh, khôi phục và phát triển kinh tế, văn hoá.","");
        final QuestionsList question4 = new QuestionsList("Quốc hội thống nhất cả nước sau cuộc Tổng tuyển bầu Quốc hội chung của cả nước (25 - 4 - 1976) là Quốc hội khoá", " Khoá IV.","Khoá V.","Khoá VI. ","Khoá VII.","Khoá VI","");
        final QuestionsList question5 = new QuestionsList("Người được bầu làm Chủ tịch nước đầu tiên của nước Cộng hoà xã hội chủ nghĩa Việt Nam là ai?", "Hồ Chí Minh. ","Tôn Đức Thắng","Lê Duẩn.","Trường Chinh.","Tôn Đức Thắng","");
        final QuestionsList question6 = new QuestionsList("Nước Cộng hòa xã hội chủ nghĩa Việt Nam vừa thành lập đã có bao nhiêu nước chính thức công nhận và đặt quan hệ ngoại giao?", "80 nước.","94 nước.","107 nước.","149 nước.","94 nước.","");


        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;

    }
        private static List<QuestionsList> toanquestions(){
            final List<QuestionsList> questionsLists = new ArrayList<>();

            final QuestionsList question1 = new QuestionsList("Phương trình z2 + 4x + 5 = 0 có các nghiệm là?", "2 ± i","-2 ± i"," 4 ± i"," -4 ± i","-2 ± i","");
            final QuestionsList question2 = new QuestionsList("Phương trình z2 + 6z + 15 = 0 có các nghiệm là z1, z2.Giá trị biểu thức T = |z1| + |z2| bằng:", "2√15 ","6.","4√5","2√3.","2√15 ","");
            final QuestionsList question3 = new QuestionsList("Phương trình z2 - 4z + 9 = 0 có hai nghiệm. Giá trị biểu thức T = |z1| + |z2| bằng?", "-6","6","8","-8","6","");
            final QuestionsList question4 = new QuestionsList("Phương trình z2 + 8z + 17 = 0 có hai nghiệm", "1 - i và 1 - 2i","4 - i và 4 + i","-4 - i và -4 + i"," -2 + 2i và -2 + 4i","-4 - i và -4 + i","");
            final QuestionsList question5 = new QuestionsList("Để phương trình z2 + bz + c = 0 nhận z1 = -4 + 2i và z2 = -4 - 2i làm nghiệm thì", "b = 8, c = -20","b = -8, c = 20","b = -8, c = -20","b = 8, c = 20","b = 8, c = 20","");
            final QuestionsList question6 = new QuestionsList("Phương trình (1 + i)2 = -7 + i có các nghiệm là", "-1 - 2i và 1 - 2i","-1 + 2i và 1 + 2i","1 + 2i và 1 + 2i","1 - 2i và 1 - 2i","-1 + 2i và 1 + 2i","");


            questionsLists.add(question1);
            questionsLists.add(question2);
            questionsLists.add(question3);
            questionsLists.add(question4);
            questionsLists.add(question5);
            questionsLists.add(question6);

            return questionsLists;


        }
        private static List<QuestionsList> hoahocquestions(){
            final List<QuestionsList> questionsLists = new ArrayList<>();

            final QuestionsList question1 = new QuestionsList("Peptit nào sau đây không có phản ứng màu biure ?", "Ala-Gly. ","Ala-Ala-Gly-Gly.","Ala-Gly-Gly. ","Gly-Ala-Gly.","Ala-Gly. ","");
            final QuestionsList question2 = new QuestionsList("Số đipeptit tối đa có thể tạo ra từ một hỗn hợp gồm alanin và glyxin là", "4","1","2","3","4","");
            final QuestionsList question3 = new QuestionsList("Thủy phân 21,9 gam Gly-Ala trong dung dịch NaOH dư thu được m gam muối. Giá trị của m là", "25,2.","31,2.","27,9.","30,9.","31,2.","");
            final QuestionsList question4 = new QuestionsList(" Khi thủy phân hoàn toàn 500 gam protein X thì thu được 178 gam alanin. Nêu phân từ khối của X là 50 000 thì số mắt xích alanin trong phân tử X là", "100","500","400","200","200","");
            final QuestionsList question5 = new QuestionsList("Đun nóng 14,6 gam Gly-Ala với lượng dư dung dịch HCl, thu được dung dịch chứa m gam muối. Giá trị của m là", " 18,25.","21,90.","23,70.","21,85.","23,70","");
            final QuestionsList question6 = new QuestionsList("Thủy phân không hoàn toàn pentapeptit Gly-Ala-Val-Ala-Gly, thu được tối đa bao nhiêu đipeptit mạch hở chứa Gly ?", "0","1","2","3","2","");


            questionsLists.add(question1);
            questionsLists.add(question2);
            questionsLists.add(question3);
            questionsLists.add(question4);
            questionsLists.add(question5);
            questionsLists.add(question6);

            return questionsLists;


        }
        private static List<QuestionsList> sinhhocquestions(){
            final List<QuestionsList> questionsLists = new ArrayList<>();

            final QuestionsList question1 = new QuestionsList("Điều hòa hoạt động gen chính là", "Điều hòa lượng sản phẩm do gen tạo ra","Điều hòa lượng mARN","Điều hòa lượng tARN","Điều hòa lượng rARN","Điều hòa lượng sản phẩm do gen tạo ra","");
            final QuestionsList question2 = new QuestionsList("Sự biểu hiện điều hòa hoạt động của gen ở sinh vật nhân sơ diễn ra chủ yếu ở cấp độ:", "Phiên mã","Sau Phiên mã","Trước Phiên mã","Dịch mã","Phiên mã","");
            final QuestionsList question3 = new QuestionsList("Chất nào đóng vai trò như tín hiệu điều hòa hoạt động gen của opêron Lac ở vi khuẩn E.coli là:", "mARN","Enzim ARN-polimeraza.","Đường lactozơ. ","Prôtêin ức chế.    ","Đường lactozơ. ","");
            final QuestionsList question4 = new QuestionsList("Trong cơ chế điều hòa hoạt động của operon Lactose của vi khuẩn E.coli, protein ức chế liên kết với vùng nào trong cấu trúc của gen?", "Vùng khởi động  ","Vùng mã hóa","Vùng vận hành  ","","Vùng vận hành  ","Vùng kết thúc");
            final QuestionsList question5 = new QuestionsList("Trong cấu trúc của operon lac, nếu đột biến làm mất một đọan phân tử ADN thì trường hợp nào sau đây sẽ vẫn tổng hợp được tất cả các gen cấu trúc.", "Mất một gen cấu trúc","Mất vùng vận hành","Mất vùng khởi động","Mất gen điều hòa","Mất gen điều hòa","");
            final QuestionsList question6 = new QuestionsList("Trong cơ chế điều hòa hoạt động của opêron Lac ở E.coli, chất đóng vai trò của chất cảm ứng là", "Prôtêin ức chế","Enzim ARN polimeraza.","Lactozơ.","Cả A, B, C.","Lactozơ.","");


            questionsLists.add(question1);
            questionsLists.add(question2);
            questionsLists.add(question3);
            questionsLists.add(question4);
            questionsLists.add(question5);
            questionsLists.add(question6);

            return questionsLists;


        }
        public static  List<QuestionsList> getQuestions(String selectedTopicName) {
            switch (selectedTopicName) {
                case "lichsu":
                    return lichsuquestions();
                case "toan":
                    return toanquestions();
                case "hoahoc":
                    return hoahocquestions();
                default:
                    return sinhhocquestions();

            }
        }

}
