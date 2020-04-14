package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import com.pluralsight.util.CalendarFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    //This is a placeholder for database information. This could be a stub instead with spring loading in values instead

    @Autowired
    private Calendar cal;

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();
        Speaker speaker = new Speaker();

        speaker.setFirstName("Antonio");
        speaker.setLastName("Vazquez");

        System.out.println("cal: " + cal.getTime());
        speakers.add(speaker);

        return speakers;
    }
}
