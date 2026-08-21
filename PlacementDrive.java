import java.util.*;

class Candidate {
    int candidateId;
    String name;
    int aptitude;
    int technical;
    int communication;

    // Constructor
    Candidate(int candidateId, String name, int aptitude, int technical, int communication) {
        this.candidateId = candidateId;
        this.name = name;
        this.aptitude = aptitude;
        this.technical = technical;
        this.communication = communication;
    }

    // Method to calculate total score
    int getTotalScore() {
        return aptitude + technical + communication;
    }
}

public class PlacementDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input N and K
        int N = sc.nextInt();
        int K = sc.nextInt();

        Candidate[] candidates = new Candidate[N];

        // Input candidate details
        for (int i = 0; i < N; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            int aptitude = sc.nextInt();
            int technical = sc.nextInt();
            int communication = sc.nextInt();

            candidates[i] = new Candidate(id, name, aptitude, technical, communication);
        }

        // Sort candidates by total score (descending), then by Candidate ID (ascending)
        Arrays.sort(candidates, new Comparator<Candidate>() {
            @Override
            public int compare(Candidate c1, Candidate c2) {
                int scoreDiff = c2.getTotalScore() - c1.getTotalScore();
                if (scoreDiff == 0) {
                    return c1.candidateId - c2.candidateId; // smaller ID first
                }
                return scoreDiff;
            }
        });

        // Display Top K candidates
        for (int i = 0; i < K; i++) {
            Candidate c = candidates[i];
            System.out.println(c.candidateId + " " + c.name + " " + c.getTotalScore());
        }

        sc.close();
    }
}
