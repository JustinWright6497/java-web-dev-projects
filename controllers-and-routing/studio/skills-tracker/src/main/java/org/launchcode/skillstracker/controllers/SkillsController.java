package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return  "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/form")
    @ResponseBody
    public String form() {
        return  "<html>" +
                "<body>" +
                "<form method = 'post' action = '/submit'>" +
                "<label>Name: <input type='text' name='name'/></label>" +
                "<br>" +
                "<label>My favorite language:</label>" +
                "<select name='language1'><option value='Java'>Java</option><option value='JavaScript'>JavaScript</option><option value='Python'>Python</option></select>" +
                "<br>" +
                "<label>My second favorite language:</label>" +
                "<select name='language2'><option value='Java'>Java</option><option value='JavaScript'>JavaScript</option><option value='Python'>Python</option></select>" +
                "<br>" +
                "<label>My third favorite language:</label>" +
                "<select name='language3'><option value='Java'>Java</option><option value='JavaScript'>JavaScript</option><option value='Python'>Python</option></select>" +
                "<br>" +
                "<button type='submit'>Submit</button>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    @ResponseBody
    public String formResponse(@RequestParam String name, String language1, String language2, String language3) {
        return  "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + language1 + "</li>" +
                "<li>" + language2 + "</li>" +
                "<li>" + language3 + "</li>" +
                "</ol>";
    }

}
