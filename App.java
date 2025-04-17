
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.Pos;


import java.util.ArrayList;
import java.util.List;

public class App extends Application {

    private Stage window;
    private Scene homeScene, surveyScene, resultScene;
    private List<Anime> animeList = new ArrayList<>();

    private CheckBox moviesBox = new CheckBox("Movies");
    private CheckBox showsBox = new CheckBox("Shows");

    private CheckBox actionBox = new CheckBox("Action");
    private CheckBox adventureBox = new CheckBox("Adventure");
    private CheckBox dramaBox = new CheckBox("Drama");
    private CheckBox fantasyBox = new CheckBox("Fantasy");
    private CheckBox comedyBox = new CheckBox("Comedy");
    private CheckBox horrorBox = new CheckBox("Horror");
    private CheckBox sliceOfLifeBox = new CheckBox("Slice of Life");
    private CheckBox mysteryBox = new CheckBox("Mystery");
    private CheckBox romanceBox = new CheckBox("Romance");
    private CheckBox scifiBox = new CheckBox("Sci-fi");
    private CheckBox sportsBox = new CheckBox("Sport");
    private CheckBox noPrefBox = new CheckBox("No Preference");

    private CheckBox popularBox = new CheckBox("Popular Only");
    private CheckBox highRatedBox = new CheckBox("High Rated Only");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        setupAnimeList();

        Label titleLabel = new Label("Anime Recommender");
        titleLabel.setStyle("-fx-font-size: 36px; -fx-font-weight: bold; -fx-text-fill: white;");
        Button startBtn = new Button("Start Survey");
        startBtn.setOnAction(_ -> window.setScene(surveyScene));

        VBox homeLayout = new VBox(50, titleLabel, startBtn);
        homeLayout.setPadding(new Insets(50));
        homeLayout.setStyle("""
            -fx-alignment: center;
            -fx-background-color: linear-gradient(to right, red, orange, yellow, green, blue, indigo, violet);
        """);
        homeScene = new Scene(homeLayout, 500, 400);

        setupSurveyScene();

        window.setTitle("Anime Recommender");
        window.setScene(homeScene);
        window.show();
    }

    private void setupAnimeList() {
        animeList.add(new Anime("Naruto", true, true, List.of("Action", "Adventure"), "Anime", true, true,
                "A ninja story about never giving up."));
        animeList.add(new Anime("One Piece", false, true, List.of("Adventure", "Action"), "Anime", true, true,
                "Pirates looking for treasure in a vast ocean."));
        animeList.add(new Anime("Bleach", true, true, List.of("Action", "Fantasy"), "Anime", true, false,
                "A soul reaper battles evil spirits."));
        animeList.add(new Anime("Attack on Titan", false, true, List.of("Action", "Adventure", "Horror"), "Anime", 
                true, true,
                "Humanity fights for survival against giant human-eating Titans."));
        animeList.add(new Anime("Demon Slayer", false, true, List.of("Action", "Adventure", "Fantasy"), "Anime",
                true, true,
                "A young boy becomes a demon slayer to save his sister."));
        animeList.add(new Anime("Gintama", false, true, List.of("Comedy", "Action", "Slice of Life"), "Anime",
                true, true,
                "Samurai in Edo-era Japan tackle absurd jobs and fourth-wall breaks."));
        animeList.add(new Anime("Your Lie in April", false, true, List.of("Drama", "Romance", "Slice of Life"), "Anime",
                true, true,
                "A piano prodigy learns to love music again through a violinist."));
        animeList.add(new Anime("Death Note", false, true, List.of("Horror", "Mystery", "Drama"), "Anime",
                true, true,
                "A genius high schooler gains a notebook that can kill anyone."));
        animeList.add(new Anime("Steins;Gate", false, true, List.of("Sci-Fi", "Mystery", "Drama", "Fantasy"), "Anime",
                true, true,
                "A scientist accidentally invents time travel with dire consequences."));
        animeList.add(new Anime("Fullmetal Alchemist: Brotherhood", false, true, List.of("Fantasy", "Adventure", "Action", "Sci-fi"), "Anime",
                true, true,
                "Two brothers search for the Philosopher's Stone to restore their bodies."));
        animeList.add(new Anime("A Silent Voice", true, false, List.of("Drama", "Slice-of-Life", "Romance"), "Anime Movie",
                true, true,
                "A former bully seeks redemption with a deaf girl he once tormented."));
        animeList.add(new Anime("Vinland Saga", false, true, List.of("Action", "Adventure"), "Anime",
                true, true,
                "A young Viking seeking revenge for the unjust murder of his father"));
        animeList.add(new Anime("Monster", false, true, List.of("Drama", "Horror", "Mystery"), "Anime",
                true, true,
                "A doctor hunts a former patient who became a serial killer."));
        animeList.add(new Anime("Grave of the Fireflies", true, false, List.of("Drama", "Horror"), "Anime Movie",
                true, true,
                "A brother and sister struggle to survive in WWII Japan."));
        animeList.add(new Anime("Cowboy Bebop", false, true, List.of("Sci-Fi", "Action", "Adventure", "Fantasy"), "Anime",
                true, true,
                "Bounty hunters navigate space with jazz and existential crises."));
        animeList.add(new Anime("Spirited Away", true, false, List.of("Fantasy", "Adventure", "Action"), "Anime Movie",
                true, true,
                "A girl works in a spirit bathhouse to save her parents."));
        animeList.add(new Anime("Haikyuu!!", false, true, List.of("Sport", "Comedy", "Drama"), "Anime",
                true, true,
                "A short volleyball player strives to become a champion."));
        animeList.add(new Anime("Neon Genesis Evangelion", false, true, List.of("Sci-Fi", "Action", "Mystery"), "Anime",
                true, true,
                "Teenagers pilot biomechanical units to save Earth from angels."));
        animeList.add(new Anime("Made in Abyss", false, true, List.of("Fantasy", "Adventure", "Horror"), "Anime",
                true, true,
                "Children explore a mysterious abyss with terrifying secrets."));
        animeList.add(new Anime("Parasyte", false, true, List.of("Horror", "Sci-Fi", "Action"), "Anime",
                 true, true,
                 "A teenager's hand becomes a symbiotic alien creature."));
        animeList.add(new Anime("Clannad: After Story", false, true, List.of("Drama", "Romance"), "Anime",
                 true, true,
                "A young man navigates adulthood after high school tragedies. (watch clannad first)"));
        animeList.add(new Anime("Samurai Champloo", false, true, List.of( "Action", "Adventure"), "Anime",
                 true, true,
                "Two samurai and a girl search for a sunflower-scented warrior."));
         animeList.add(new Anime("Princess Mononoke", true, false, List.of("Fantasy", "Action"), "Anime Movie",
                true, true,
                "A prince battles industrialists and gods to save a forest."));
        animeList.add(new Anime("Your Name", true, false, List.of("Romance", "Mystery", "Drama"), "Anime Movie",
                true, true,
                "Two teenagers mysteriously swap bodies and develop a connection."));
        animeList.add(new Anime("Redline", true, false, List.of("Sci-Fi", "Action"), "Anime Movie",
                false, true,
                "An illegal intergalactic car race with insane animation."));
        animeList.add(new Anime("Sword of the Stranger", true, false, List.of("Action", "Adventure", "Mystery"), "Anime Movie",
                false, true,
                "A ronin protects a boy with a mysterious past."));
        animeList.add(new Anime("Perfect Blue", true, false, List.of("Mystery", "Horror", "Drama"), "Anime Movie",
                true, true,
                "A pop singer's reality unravels as she's stalked."));
        animeList.add(new Anime("Paprika", true, false, List.of("Sci-Fi", "Mystery", "Surreal"), "Anime Movie",
                false, true,
                "A therapist enters patients' dreams with dangerous consequences."));
        animeList.add(new Anime("Howl's Moving Castle", true, false, List.of("Fantasy", "Adventure", "Romance"), "Anime Movie",
                true, true,
                "A cursed girl joins a wizard in his magical walking castle."));
        animeList.add(new Anime("The Tale of the Princess Kaguya", true, false, List.of("Fantasy", "Drama"), "Anime Movie",
                false, true,
                "A bamboo cutter finds a tiny princess in a stalk."));
        animeList.add(new Anime("Wolf Children", true, false,
                List.of("Slice-of-Life", "Fantasy", "Drama"), "Anime Movie",
                true, true,
                "A mother raises half-wolf children after her lover's death."));
        animeList.add(new Anime("Maquia: When the Promised Flower Blooms", true, false, List.of("Fantasy", "Drama", "Adventure"), "Anime Movie",
                false, true,
                "An immortal being raises a human child in a war-torn world."));
        animeList.add(new Anime("Kaiba", false, true, List.of("Sci-Fi"), "Anime",
             false, true,
           "A man with amnesia searches for his past in a world where memories are commodified."));
        animeList.add(new Anime("The Great Passage", false, true, List.of("Slice-of-Life", "Drama"), "Anime",
             false, true,
             "A team crafts a dictionary over decades, exploring the power of words."));
        animeList.add(new Anime("Shouwa Genroku Rakugo Shinjuu", false, true, List.of("Drama"), "Anime",
             false, true,
             "A former convict learns the traditional art of rakugo storytelling."));
        animeList.add(new Anime("House of Five Leaves", false, true, List.of("Drama", "Mystery"), "Anime",
            false, true,
          "A timid samurai joins a mysterious group of kidnappers in Edo-era Japan."));
        animeList.add(new Anime("The First Slam Dunk", true, false, List.of("Sport", "Drama", "Action"), "Anime Movie",
          true, true,
          "A high school basketball team competes in a national championship."));
        animeList.add(new Anime("Ping Pong the Animation", false, true, List.of("Sport", "Drama"), "Anime",
            false, true,
          "Two friends with contrasting play styles compete in table tennis."));
          animeList.add(new Anime("Giant Killing", false, true, List.of("Sport", "Drama"), "Anime",
            false, true,
          "A former star player returns to coach his struggling hometown soccer team."));
          animeList.add(new Anime("Yuri!!! on Ice", false, true, List.of("Sport", "Drama"), "Anime",
             true, true,
           "A figure skater reinvents himself with help from a legendary coach.")); 
           animeList.add(new Anime("Kuroko's Basketball", false, true, List.of("Sport", "Action"), "Anime",
            true, true,
          "The 'Generation of Miracles' reunites in high school with a mysterious sixth member."));
          animeList.add(new Anime("Blue Lock", false, true, List.of("Sport"), "Anime",
            true, true,
          "300 strikers compete in a brutal training program to create Japan's ultimate soccer forward."));
          animeList.add(new Anime("Hajime no Ippo", false, true, List.of("Sport", "Comedy", "Drama"), "Anime",
            true, true,
          "A bullied teenager transforms into a professional boxer through relentless training."));
          animeList.add(new Anime("Megalo Box", false, true, List.of("Sport"), "Anime",
            true, true,
          "An underground fighter competes in high-tech boxing matches to challenge the champion."));
          animeList.add(new Anime("Baki", false, true, List.of("Sport", "Action"), "Anime",
            true, false,
          "Baki Hanma trains to surpass his father in brutal underground fighting tournaments."));
          animeList.add(new Anime("Kengan Ashura", false, true, List.of("Sport", "Action"), "Anime",
            true, false,
          "Business disputes are settled through underground gladiator-style fights."));
          animeList.add(new Anime("Naruto: The Last", true, false, List.of("Action", "Adventure", "Romance"), "Anime Movie",
            true, true,
          "Naruto must save Hinata and prevent the moon from crashing into Earth after the events of Shippuden."));
          animeList.add(new Anime("Bleach: Hell Verse", true, false, List.of("Action","Horror"), "Anime Movie",
            true, false,
          "Ichigo ventures into Hell to rescue a friend and confronts his darkest impulses."));
         animeList.add(new Anime("One Piece Film: Red", true, false, List.of("Action", "Adventure"), "Anime Movie",
            true, true,
          "The Straw Hats encounter Uta, a legendary singer with shocking ties to Shanks."));
          animeList.add(new Anime("Dragon Ball Super: Broly", true, false, List.of("Action", "Sci-Fi"), "Anime Movie",
            true, true,
          "Goku and Vegeta face Broly, an immensely powerful Saiyan warrior."));


    }

    private void setupSurveyScene() {
        VBox layout = new VBox(30);
        layout.setPadding(new Insets(40));
        layout.setAlignment(Pos.TOP_CENTER);
        layout.setStyle("""
            -fx-background-color: linear-gradient(to bottom right, red, orange, yellow, green, blue, indigo, violet);
        """);

         // Title
    Label title = new Label("ANIME RECOMMENDER");
    title.setStyle("-fx-font-size: 36px; -fx-text-fill: white; -fx-font-weight: bold;");

        VBox q1Box = new VBox(10);
        q1Box.setPadding(new Insets(20));
        q1Box.setStyle("-fx-background-color: white; -fx-background-radius: 20;");
        Label q1 = new Label("What type of content do you want?");
        q1.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
        VBox typeBox = new VBox(5, moviesBox, showsBox); 
        // Q1
        q1Box.getChildren().addAll(q1, typeBox);

        // Q2
        VBox q2Box = new VBox(10);
        q2Box.setPadding(new Insets(20));
        q2Box.setStyle("-fx-background-color: white; -fx-background-radius: 20;");
        Label q2 = new Label("Which genres do you enjoy?");
        q2.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");

        q2.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
    VBox genreBox = new VBox(5, actionBox, adventureBox, dramaBox, fantasyBox, comedyBox, horrorBox,
        sliceOfLifeBox, mysteryBox, romanceBox, scifiBox, sportsBox, noPrefBox);
    q2Box.getChildren().addAll(q2, genreBox);
        noPrefBox.setOnAction(_ -> {
            if (noPrefBox.isSelected()) {
                actionBox.setSelected(false);
                adventureBox.setSelected(false);
                dramaBox.setSelected(false);
                fantasyBox.setSelected(false);
                comedyBox.setSelected(false);
                horrorBox.setSelected(false);
                sliceOfLifeBox.setSelected(false);
                romanceBox.setSelected(false);
                scifiBox.setSelected(false);
                mysteryBox.setSelected(false);
                sportsBox.setSelected(false);


                actionBox.setDisable(true);
                adventureBox.setDisable(true);
                dramaBox.setDisable(true);
                fantasyBox.setDisable(true);
                comedyBox.setDisable(true);
                horrorBox.setDisable(true);
                sliceOfLifeBox.setDisable(true);
                romanceBox.setDisable(true);
                scifiBox.setDisable(true);
                mysteryBox.setDisable(true);
                sportsBox.setDisable(true);
        
            } else {
                actionBox.setDisable(false);
                adventureBox.setDisable(false);
                dramaBox.setDisable(false);
                fantasyBox.setDisable(false);
                comedyBox.setDisable(false);
                horrorBox.setDisable(false);
                sliceOfLifeBox.setDisable(false);
                romanceBox.setDisable(false);
                scifiBox.setDisable(false);
                mysteryBox.setDisable(false);
                sportsBox.setDisable(false);
            }
        });

        // Q6
        VBox q3Box = new VBox(10);
        q3Box.setPadding(new Insets(20));
        q3Box.setStyle("-fx-background-color: white; -fx-background-radius: 20;");
        Label q3 = new Label("Do you want popular or highly rated anime?");
        q3.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
        VBox popBox = new VBox(5, popularBox, highRatedBox);
        q3Box.getChildren().addAll(q3, popBox);

        Button submitBtn = new Button("Submit");
        submitBtn.setStyle("""
            -fx-font-size: 16px;
            -fx-background-radius: 12;
            -fx-padding: 8 20;
            -fx-font-weight: bold;
        """);
        submitBtn.setOnAction(_ -> showResults());

        layout.getChildren().addAll(title, q1Box, q2Box, q3Box, submitBtn);

        surveyScene = new Scene(layout, 600, 700);
    }

      

    private void showResults() {
        VBox resultLayout = new VBox(10);
        resultLayout.setPadding(new Insets(20));

        for (Anime anime : animeList) {
            if (matchesSurvey(anime)) {
                VBox card = new VBox(5);
                card.setStyle("-fx-border-color: black; -fx-border-width: 1; -fx-padding: 10;");
                Label name = new Label(anime.name);
                Label desc = new Label(anime.description);
                card.getChildren().addAll(name, desc);
                resultLayout.getChildren().add(card);
            }
        }

        Button backBtn = new Button("Back to Home");
        backBtn.setOnAction(_ -> window.setScene(homeScene));
        resultLayout.getChildren().add(backBtn);

        resultScene = new Scene(new ScrollPane(resultLayout), 600, 400);
        window.setScene(resultScene);
    }

    private boolean matchesSurvey(Anime anime) {
        if (moviesBox.isSelected() && !anime.isMovie) return false;
        if (showsBox.isSelected() && !anime.isShow) return false;
        if (!moviesBox.isSelected() && !showsBox.isSelected()) return false;



        if (!noPrefBox.isSelected()) {
            boolean hasGenre = false;
            if (actionBox.isSelected() && anime.genres.contains("Action")) hasGenre = true;
            if (adventureBox.isSelected() && anime.genres.contains("Adventure")) hasGenre = true;
            if (dramaBox.isSelected() && anime.genres.contains("Drama")) hasGenre = true;
            if (fantasyBox.isSelected() && anime.genres.contains("Fantasy")) hasGenre = true;
            if (comedyBox.isSelected() && anime.genres.contains("Comedy")) hasGenre = true;
            if (horrorBox.isSelected() && anime.genres.contains("Horror")) hasGenre = true;
            if (sliceOfLifeBox.isSelected() && anime.genres.contains("Slice of life")) hasGenre = true;
            if (romanceBox.isSelected() && anime.genres.contains("Romance")) hasGenre = true;
            if (scifiBox.isSelected() && anime.genres.contains("Sci-fi")) hasGenre = true;
            if (mysteryBox.isSelected() && anime.genres.contains("Mystery")) hasGenre = true;
            if (sportsBox.isSelected() && anime.genres.contains("Sport")) hasGenre = true;
            if (!hasGenre) return false;
        }

        if (popularBox.isSelected() && !anime.isPopular) return false;
        if (highRatedBox.isSelected() && !anime.isHighRated) return false;

        return true;
    }

    static class Anime {
    String name;
    boolean isMovie;
    boolean isShow;
    List<String> genres;
    String type;
    boolean isPopular;
    boolean isHighRated;
    String description;

    Anime(String name, boolean isMovie, boolean isShow, List<String> genres, String type,
          boolean isPopular, boolean isHighRated, String description) {
        this.name = name;
        this.isMovie = isMovie;
        this.isShow = isShow;
        this.genres = genres;
        this.type = type;
        this.isPopular = isPopular;
        this.isHighRated = isHighRated;
        this.description = description;
    }
}



}
