package dkurata38.afb.web.usecase.autofollow

import dkurata38.afb.domain.autofollow.AutoFollowService
import dkurata38.afb.domain.followkeyword.FollowKeywordRepository
import org.springframework.stereotype.Service

@Service
class AutoFollowUseCase(private val followKeywordRepository: FollowKeywordRepository,
                        private val autoFollowService: AutoFollowService) {
    fun autoFollow(userId: String): Unit {
        //keyword取得


        //
    }
}