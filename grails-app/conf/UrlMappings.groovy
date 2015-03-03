class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/" (controller: 'public')
        "/info" (view: "/info")
        "500" (view: '/error')
	}
}
