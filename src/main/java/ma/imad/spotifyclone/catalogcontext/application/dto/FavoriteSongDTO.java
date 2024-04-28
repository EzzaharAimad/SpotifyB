package ma.imad.spotifyclone.catalogcontext.application.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import ma.imad.spotifyclone.catalogcontext.application.vo.SongAthorVO;
import ma.imad.spotifyclone.catalogcontext.application.vo.SongTitleVO;

import java.util.UUID;

public record FavoriteSongDTO(@NotNull boolean favorite, @NotNull UUID publicId) {
}
