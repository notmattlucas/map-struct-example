import dto.MatchDTO;
import model.Match;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MatchMapper {

    MatchMapper INSTANCE = Mappers.getMapper(MatchMapper.class);

    @Mapping(source = "homeTeam", target = "home")
    @Mapping(source = "awayTeam", target = "away")
    Match fromDto(MatchDTO dto);

}
