package com.well.controller;

import com.well.model.vo.NewsDetailVO;
import com.well.model.vo.NewsListVO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * RichurLiu
 * 2020/3/24 22:41
 */
@RestController
@RequestMapping("/well/news/")
public class NewsController {
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public NewsListVO newsList(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin","*");
        NewsListVO newsListVO = new NewsListVO();
        newsListVO.setStatus(0);
        List<NewsDetailVO> newsList = new ArrayList<>();
        newsListVO.setNewsList(newsList);
        for (int i = 0; i < 30; i++) {
            NewsDetailVO newsDetailVO = new NewsDetailVO();
            newsDetailVO.setId(i*3+2L);
            newsDetailVO.setClick((i*3+2)*8);
            newsDetailVO.setTitle("习近平同巴西总统博索纳罗通电话_"+i);
            newsDetailVO.setImgUrl("https://i2.sinaimg.cn/dy/deco/2012/0613/yocc20120613img01/news_logo.png");
            newsDetailVO.setAddTime("2020-03-24 22:00:23");
            newsList.add(newsDetailVO);
        }
        return newsListVO;
    }

    @RequestMapping(value = "detail/{id}", method = RequestMethod.GET)
    public NewsDetailVO newsDetail(HttpServletResponse response, @PathVariable("id")Long id){
        response.setHeader("Access-Control-Allow-Origin","*");
        NewsDetailVO newsDetailVO = new NewsDetailVO();


        newsDetailVO.setStatus(0);
        newsDetailVO.setId(id);
        newsDetailVO.setClick((int)(id*8));
        newsDetailVO.setTitle("习近平同巴西总统博索纳罗通电话_"+ ((id-2)/3));
        newsDetailVO.setImgUrl("https://i2.sinaimg.cn/dy/deco/2012/0613/yocc20120613img01/news_logo.png");
        newsDetailVO.setAddTime("2020-03-24 22:00:23");
        newsDetailVO.setContent("<div class=\"article\" id=\"article\">\n" +
                "<p>原标题：习近平同巴西总统博索纳罗通电话</p>\n" +
                "<p cms-style=\"font-L\">　　新华社北京3月24日电 国家主席习近平24日晚应约同巴西总统博索纳罗通电话。</p>\n" +
                "<p cms-style=\"font-L\">　　习近平代表中国政府和中国人民向巴西政府和巴西人民抗击新冠肺炎疫情表示诚挚慰问和坚定支持。习近平指出，近来，疫情在全球多点暴发，扩散很快。当务之急，各国要加强合作。中方始终秉持人类命运共同体理念，本着公开、透明、负责任态度，及时发布疫情信息，毫无保留同世卫组织和国际社会分享防控、治疗经验，并尽力为各方提供援助。我十分关注巴西疫情发展，希望巴方尽早遏制疫情扩散。今天，中国同包括巴西在内的拉美和加勒比国家举行了视频工作会议，就疫情防控开展交流。中方愿向巴方提供力所能及的帮助，为防止疫情在世界范围扩散贡献力量。</p>\n" +
                "<p cms-style=\"font-L\">　　习近平强调，中国为抗击疫情付出了巨大牺牲，为国际社会赢得了宝贵时间，国际社会对此已有公论。中巴两国互为全面战略伙伴。双方要保持战略定力，支持彼此核心利益和重大关切，共同向国际社会发出团结一致的声音，传递携手应对疫情的积极信号，同时推进各领域务实合作，加强在二十国集团、金砖国家等多边框架内的沟通和协作，共同维护好、发展好中巴全面战略伙伴关系。我相信，中巴两国一定能够携手战胜疫情，并推动中巴全方位合作不断迈上新台阶。</p>\n" +
                "<p cms-style=\"font-L\">　　博索纳罗表示，当前新冠肺炎疫情在巴西呈现蔓延势头。巴方感谢中方为巴西在华采购必要医疗物资提供便利，希望同中方加强防控经验交流，共同抗击疫情，尽快遏制住国内疫情扩散。我向伟大的中国人民致敬，并重申巴中友谊和巴中全面战略伙伴关系坚不可摧。巴方愿同中方加强双边合作，并加强在二十国集团等多边框架内的沟通协调，为抗击疫情和经济恢复发挥应有作用。</p>\t\t\t\n" +
                "<p class=\"show_author\">责任编辑：刘德宾</p>\n" +
                "</div>");
        return newsDetailVO;
    }
}
