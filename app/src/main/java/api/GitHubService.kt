package api

import com.raywenderlich.githubrepolist.data.RepoResult
import retrofit2.Call
import retrofit2.http.GET

interface GitHubService {
    @GET("/repositories")
    fun retrieveRepositories() : Call<RepoResult>

    @GET ("/search/repositories?q=language:kotlin&sort=star&order=desc&per_page=50")
    fun searchRepositories(): Call<RepoResult>

}