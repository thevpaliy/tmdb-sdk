package com.vpaliy.tmdb.model

data class TMDBTVDetails(var backdrop_path:String,
                         var first_air_date:String,
                         var episode_run_time:Array<Int>,
                         var origin_country:Array<String>,
                         var genres:Array<GenreModel>,
                         var created_by:Array<TMDBCreator>,
                         var production_companies:Array<ProductionCompany>,
                         var networks:Array<NetworkModel>,
                         var seasons:Array<SeasonModel>,
                         var languages:Array<String>,
                         var homepage:String,
                         var id:Int,
                         var in_production:Boolean,
                         var last_air_date:String,
                         var name:String,
                         var number_of_episodes:Int,
                         var number_of_seasons: Int,
                         var original_language:String,
                         var original_name:String,
                         var overview:String,
                         var popularity:Double,
                         var poster_path:String,
                         var status:String,
                         var type:String,
                         var vote_average:Int,
                         var vote_count:Int)


data class TMDBCreator(var id:Int,
                       var name:String,
                       var gender:Int?,
                       var profile_path:String)