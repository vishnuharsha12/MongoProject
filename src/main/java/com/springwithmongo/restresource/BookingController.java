package com.springwithmongo.restresource;

import com.springwithmongo.repository.BookingRepository;
import com.springwithmongo.document.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
    @RequestMapping("/books")
    public class BookingController {
    BookingRepository bookingrepo;
    public BookingController(BookingRepository bookingrepo) {
        this.bookingrepo = bookingrepo;
    }




        @GetMapping("/allbooks")
        public List<Booking> getAllBooks(){

    return  bookingrepo.findAll();
        }
        /*public Map<String, Object> create(Booking booking) {
            booking.setTravelDate(new Date());
           bookingrepo=new BookingRepoImpl();
            booking = (Booking) bookingrepo.save(booking);
            Map<String, Object> dataMap = new HashMap<String, Object>();
            dataMap.put("message", "Booking created successfully");
            dataMap.put("status", "1");
            dataMap.put("booking", booking);
            return dataMap;
        }*/

}
