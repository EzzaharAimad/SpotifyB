package ma.imad.spotifyclone.catalogcontext.application.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import ma.imad.spotifyclone.catalogcontext.application.vo.SongAthorVO;
import ma.imad.spotifyclone.catalogcontext.application.vo.SongTitleVO;

public record SaveSongDTO(@Valid SongTitleVO songTitleVO,
                          @Valid SongAthorVO songAthorVO,
                          @NotNull byte[] cover,
                          @NotNull String coverContentType,
                          @NotNull byte[] file,
                          @NotNull String fileContentType
                          ) {
}
