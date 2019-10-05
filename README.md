# SpringRest.RealEstates
2nd Demo Spring Rest App for Real Estates 

API będzie realizowało następujące cele biznesowe:  
	* 
dodanie, usunięcie, skasowanie, modyfikację oferty  
	* 
dodanie, usunięcie, skasowanie, modyfikację danych klienta


W aplikacji wyróżniamy następujące klasy dziedzinowe:  
	* 
Typ nieruchomości – typ enum  
	* 
Miejscowość – dla uproszczenia przyjęto typ enum, w normalnej aplikacji będzie to wartość pobierana z bazy danych  
	* 
Oferta – klasa przechowująca dane obiektu  
	* 
Klienci – klasa przechowująca dane klienta  


Przewidziane są następujące sytuacje wyjątkowe:  
	* 
W przypadku braku oferty, klienta o podanym ID generowany jest status 404  
	* 
W przypadku wystąpienia ogólnego wyjątku w kodzie aplikacji generowany jest status 503  


Dane w przykładowej aplikacji będą przechowane w wewnętrznych kolekcjach.

***
sample client:  
{
    "id": 3,
    "firstName": "Rick",
    "lastName": "Sanchez"
}