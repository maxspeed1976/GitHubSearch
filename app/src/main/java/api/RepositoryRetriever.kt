package api

import com.raywenderlich.githubrepolist.data.RepoResult
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RepositoryRetriever {

        private val service: GitHubService = TODO()

    companion object {
            const val BASE_URL = "https://api.github.com/"
        }
    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        service = retrofit.create(GitHubService::class.java)
    }

    fun getRepositories(callback: Callback<RepoResult>) {
        val call = service.searchRepositories()
        call.enqueue(callback)

    }

}


