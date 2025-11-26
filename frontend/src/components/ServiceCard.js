import React from 'react';

function ServiceCard({ servicio, onReservar }) {
  return (
    <div className="border rounded-lg p-6 shadow-lg bg-white hover:shadow-xl transition-shadow duration-300">
      <h3 className="text-xl font-bold text-gray-800 mb-2">{servicio.nombre}</h3>
      <p className="text-gray-600 mb-4">{servicio.descripcion}</p>
      <div className="flex justify-between items-center">
        <span className="text-2xl font-bold text-pink-600">${servicio.precio}</span>
        <button 
          onClick={() => onReservar(servicio)}
          className="bg-black text-white px-4 py-2 rounded hover:bg-gray-800 transition-colors"
        >
          Reservar
        </button>
      </div>
    </div>
  );
}

export default ServiceCard;