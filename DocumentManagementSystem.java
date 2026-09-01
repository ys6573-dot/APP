// Tagging interface (marker interface)
interface Confidential {
    // No methods, just a marker
}

// Base Document class
class Document {
    String title;

    Document(String title) {
        this.title = title;
    }

    void display() {
        System.out.println("Document: " + title);
    }
}

// PublicDocument class (not confidential)
class PublicDocument extends Document {
    PublicDocument(String title) {
        super(title);
    }
}

// ConfidentialReport class (confidential)
class ConfidentialReport extends Document implements Confidential {
    ConfidentialReport(String title) {
        super(title);
    }
}

// ConfidentialContract class (confidential)
class ConfidentialContract extends Document implements Confidential {
    ConfidentialContract(String title) {
        super(title);
    }
}

// Main class
public class DocumentManagementSystem {
    public static void main(String[] args) {
        // Create different documents
        Document d1 = new PublicDocument("Company Newsletter");
        Document d2 = new ConfidentialReport("Annual Financial Report");
        Document d3 = new ConfidentialContract("Merger Agreement");

        // Store them in an array
        Document[] docs = { d1, d2, d3 };

        // Check confidentiality using instanceof
        for (Document doc : docs) {
            doc.display();
            if (doc instanceof Confidential) {
                System.out.println("⚠️ This document is CONFIDENTIAL.");
            } else {
                System.out.println("ℹ️ This document is PUBLIC.");
            }
            System.out.println("----------------------------");
        }
    }
}
