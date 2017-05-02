package com.mohamadamin.cleantvmaze.domain.repository.datasource

import com.mohamadamin.cleantvmaze.domain.entity.Episode
import com.mohamadamin.cleantvmaze.domain.entity.Show
import rx.Observable

/**
 * @author MohamadAmin Mohamadi (mohammadi.mohamadamin@gmail.com) on 5/2/17.
 */
interface RetrieveShowDataSource {

    fun getShows(page: Int): Observable<List<Show>>

    fun getShow(showId: String): Observable<Show>

    fun getShowEpisodes(showId: String): Observable<List<Episode>>

    fun getShowSeasons(showId: String): Observable<List<Season>>

    fun singleSearchShow(query: String): Observable<Show>

    fun searchShows(query: String): Observable<List<Show>>

}