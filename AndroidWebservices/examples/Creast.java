@EndPoint("http://ajax.googleapis.com")
@Path("ajax/services/search")
@QueryParam(value = "v", defaultValue = "1.0")
@ResponseHandler(GoogleResponseHandler.class)
public interface SearchService {

    @Path("web")
    SearchResult<Address> search(@QueryParam("q") String text);

}

// more stuff
CRest crest = CRest.getInstance();
SearchService searchService = crest.build(SearchService.class);