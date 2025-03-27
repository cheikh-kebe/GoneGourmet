import { useState, useEffect } from "react";
import api from "../services/api";

const TestConnection = () => {
  const [status, setStatus] = useState<string>("En attente...");
  const [error, setError] = useState<string>("");

  useEffect(() => {
    const testConnection = async () => {
      try {
        await api.get("/test");
        setStatus("Connexion établie avec succès !");
        setError("");
      } catch (err) {
        setStatus("Erreur de connexion");
        setError(
          err instanceof Error ? err.message : "Une erreur est survenue"
        );
      }
    };

    testConnection();
  }, []);

  return (
    <div>
      <h2>Test de Connexion API</h2>
      <p>Status: {status}</p>
      {error && <p style={{ color: "red" }}>{error}</p>}
    </div>
  );
};

export default TestConnection;
