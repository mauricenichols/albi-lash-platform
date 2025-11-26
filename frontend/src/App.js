import React, { useEffect, useState } from 'react';
import { obtenerServicios } from './services/api';
import ServiceCard from './components/ServiceCard';

function App() {
  const [servicios, setServicios] = useState([]);

  useEffect(() => {
    // Usamos nuestra nueva función del servicio
    const cargarDatos = async () => {
      const data = await obtenerServicios();
      setServicios(data);
    };
    cargarDatos();
  }, []);

  const manejarReserva = (servicio) => {
    alert(`Has seleccionado: ${servicio.nombre}`);
    // Aquí luego conectaremos con el carrito
  };

  return (
    <div className="container mx-auto px-4 py-8 font-sans">
      <header className="text-center mb-12">
        <h1 className="text-4xl font-bold text-pink-600 mb-2">ALBI LASH</h1>
        <p className="text-gray-500">Estudio Profesional de Miradas</p>
      </header>

      <main>
        <h2 className="text-2xl font-semibold text-center mb-8">Nuestros Servicios</h2>
        
        <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-6">
          {servicios.length === 0 ? (
            <p className="text-center col-span-3 text-gray-400">Cargando catálogo...</p>
          ) : (
            servicios.map(servicio => (
              <ServiceCard 
                key={servicio.id} 
                servicio={servicio} 
                onReservar={manejarReserva} 
              />
            ))
          )}
        </div>
      </main>
    </div>
  );
}

export default App;