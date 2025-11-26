const API_URL = "http://localhost:8082/api/servicios"; // Ajusta el puerto si es necesario

export const obtenerServicios = async () => {
  try {
    const response = await fetch(API_URL);
    if (!response.ok) {
      throw new Error("Error en la respuesta del servidor");
    }
    return await response.json();
  } catch (error) {
    console.error("Error conectando con el backend:", error);
    return [];
  }
};