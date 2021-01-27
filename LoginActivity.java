public class ActivityLogin extends AppCompatActivity {

        private FirebaseFirestore firebaseFirestore;
        private StorageReference storageReference;

        ImageView FotoLogo;
        EditText TextUser, TextPassword;
        Button TombolSimpan, TombolKembali;
        ProgressBar progressBar;

        private Uri filePath;
        private String fotoUrl;

        private static final int IMAGE_REQUEST = 1;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_tambah_contact);

            FotoLogo = findViewById(R.id.imageView);
            TextUser = findViewById(R.id.editTextUser);
            TextPassword = findViewId(R.id.editTextPassword);


            TombolSignIn = findViewById(R.id.buttonSignIn);

            progressBar = findViewById(R.id.progressBar);

            progressBar.setVisibility(View.INVISIBLE);

            firebaseFirestore = FirebaseFirestore.getInstance();
            storageReference = FirebaseStorage.getInstance().getReference();

            TombolSignIn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    uploadImage();
                }

            });

            private void SimpanData(String user, String password, ){

            Map<String, Object> contactData = new HashMap<>();

            contactData.put("User", User);
            contactData.put("Password", password);

            firebaseFirestore.collection("Contacts").document(telepon).set(contactData).isSuccessful();
        }


        uploadTask.addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onProgress(@NonNull UploadTask.TaskSnapshot taskSnapshot) {
                        progressBar.setVisibility(View.VISIBLE);
                        double progres = (100.0*taskSnapshot.getBytesTransferred()/taskSnapshot.getTotalByteCount());
                        progressBar.setProgress((int)progres);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        progressBar.setVisibility(View.INVISIBLE);
                        Toast.makeText(ActivityLogin.this, "Failed " + e.getMessage(), Toast.LENGTH_LONG).show();
                    }
                });
            }
        }
    }

}
