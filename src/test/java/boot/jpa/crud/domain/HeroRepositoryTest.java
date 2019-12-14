package boot.jpa.crud.domain;

import boot.jpa.crud.domain.hero.Hero;
import boot.jpa.crud.domain.hero.HeroRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
public class HeroRepositoryTest {

    @Autowired
    private HeroRepository heroRepository;

    @After
    public void cleanUp(){
        heroRepository.deleteAll();
    }

    @Test
    public void HeroSaveRequestTest(){
        //given
        Hero input = Hero.builder()
                .name("misun")
                .age(25)
                .note("sim")
                .build();

        //when
        Hero output = heroRepository.save(input);

        //then
        assertThat(input, is(output));
    }
}
