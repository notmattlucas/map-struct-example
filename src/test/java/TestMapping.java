import dto.MatchDTO;
import dto.TeamDto;
import model.Match;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMapping {

    @Test
    public void shouldMapObjects() {
        MatchDTO matchDTO = new MatchDTO(
                new TeamDto("Man City"), 0,
                new TeamDto("Brighton"), 0
        );

        Match match = MatchMapper.INSTANCE.fromDto(matchDTO);

        assertEquals(match.getHome().getName(), "Man City");
        assertEquals(match.getHomeScore(), 0);
        assertEquals(match.getAway().getName(), "Brighton");
        assertEquals(match.getAwayScore(), 0);
    }

}
