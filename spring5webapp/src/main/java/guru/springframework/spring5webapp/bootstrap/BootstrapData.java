package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

  private final AuthorRepository authorRepository;
  private final BookRepository bookRepository;
  private final PublisherRepository publisherRepository;

  public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
    this.authorRepository = authorRepository;
    this.bookRepository = bookRepository;
    this.publisherRepository = publisherRepository;
  }

  @Override
  public void run(String... args) throws Exception {

    System.out.println("Started in Bootstrap");

    Publisher oReilly = new Publisher("O Reilly", "123 Book Lane", "Binding", "PA", "83240");
    publisherRepository.save(oReilly);

    Author eric = new Author("Eric", "Evans");
    Book ddd = new Book("Domain Driven Design", "123123");

    eric.getBooks().add(ddd);
    ddd.getAuthors().add(eric);
    ddd.setPublisher(oReilly);
    oReilly.getBooks().add(ddd);

    authorRepository.save(eric);
    bookRepository.save(ddd);
    publisherRepository.save(oReilly);

    Author rod = new Author("Rod", "Johnson");
    Book noEJB = new Book("J2EE Development without EJ8", "3856436854");
    rod.getBooks().add(noEJB);
    noEJB.getAuthors().add(rod);
    noEJB.setPublisher(oReilly);
    oReilly.getBooks().add(noEJB);

    authorRepository.save(rod);
    bookRepository.save(noEJB);
    publisherRepository.save(oReilly);

    System.out.println("Number of Books: " + bookRepository.count());

    System.out.println("Number of Publishers: " + publisherRepository.count());

    System.out.println(oReilly);
  }
}
