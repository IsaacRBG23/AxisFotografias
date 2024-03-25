package com.axis.axisfotografias.elementos

data class VialidadesA(
    val idVialidad: Int,
    val nombre: String,
    val secciones: List<Seccion>
)

data class Seccion(
    val secc: String
)
{companion object{
    val vialidades = listOf(
        VialidadesA(
            3,
            "3-Vía Morelos",
            listOf(
                Seccion("759-1"),
                Seccion("759-2"),
                Seccion("759-3"),
                Seccion("759-4")
            )
        ),
        VialidadesA(
            5,
            "5-Boulevard Cuauhtémoc",
            listOf(
                Seccion("6003-1"),
                Seccion("6003-2"),
                Seccion("6003-3"),
                Seccion("6003-4")

            )
        ),
        VialidadesA(
            7,
            "7-Vía José López Portillo",
            listOf(
                Seccion("300-1"),
                Seccion("300-2")
            )
        ),

        VialidadesA(
            8,
            "8-Vialidad Mexiquense",
            listOf(
                Seccion("V. Mexiquense-1"),
                Seccion("V. Mexiquense-2"),
                Seccion("V. Mexiquense-3"),
                Seccion("V. Mexiquense-4")
            )
        ),

        VialidadesA(
            9,
            "9-Paseo Adolfo López Mateos",
            listOf(
                Seccion("297-1"),
                Seccion("297-2")
            )
        ),

        VialidadesA(
            10,
            "10-Periférico Oriente",
            listOf(
                Seccion("Periférico Oriente-1"),
                Seccion("Periférico Oriente-2")
            )
        ),

        VialidadesA(
            11,
            "11-Vía Gustavo Baz",
            listOf(
                Seccion("761-1"),
                Seccion("761-2"),
                Seccion("761-3"),
                Seccion("761-4")
            )
        ),

        VialidadesA(
            12,
            "12-Paseo Tollocan Centrales",
            listOf(
                Seccion("3015-1"),
                Seccion("3015-2"),
                Seccion("3015-3"),
                Seccion("3015-4"),
                Seccion("3015-5")
            )
        ),

        VialidadesA(
            14,
            "14-Avenida Central",
            listOf(
                Seccion("799-1"),
                Seccion("799-2"),
                Seccion("799-3"),
                Seccion("799-4")
            )
        ),

        VialidadesA(
            16,
            "16-Santa Elena-Tultepec-coacalco De Berriozabal",
            listOf(
                Seccion("782-1"),
                Seccion("782-2")
            )
        ),

        VialidadesA(
            18,
            "18-Autopista México Puebla a Chalco el Cedral",
            listOf(
                Seccion("Méx. Puebla-1"),
                Seccion("Méx. Puebla-2"),
                Seccion("Méx. Puebla-3")
            )
        ),
        VialidadesA(
            22,
            "22-Toluca-Temoaya",
            listOf(
                Seccion("Toluca-Temoaya-1"),
                Seccion("Toluca-Temoaya-2"),
                Seccion("Toluca-Temoaya-3"),
                Seccion("Toluca-Temoaya-4"),
                Seccion("Toluca-Temoaya-5")
            )
        ),
        VialidadesA(
            23,
            "23-Xonacatlan-Presa José Antonio Alzate",
            listOf(
                Seccion("224B-1"),
                Seccion("224B-2")
            )
        ),
        VialidadesA(
            24,
            "24-Laterales De La Avenida Central",
            listOf(
                Seccion("800-1"),
                Seccion("800-2")
            )
        ),
        VialidadesA(
            25,
            "25-Prolongación Avenida Isidro Fabela(Toluca-Palmillas)",
            listOf(
                Seccion("296-1"),
                Seccion("296-2"),
                Seccion("296-3"),
                Seccion("296-4")
            )
        ),
        VialidadesA(
            26,
            "26-Avenida delas Partidas",
            listOf(
                Seccion("305-1"),
                Seccion("305-2")
            )
        ),
        VialidadesA(
            29,
            "29-Avenida Primero De Mayo",
            listOf(
                Seccion("768-1"),
                Seccion("768-2")
            )
        ),
        VialidadesA(
            30,
            "30-Cuatitlán-Melchor Ocampo",
            listOf(
                Seccion("797A-1"),
                Seccion("797A-2"),
                Seccion("797A-3")
            )
        ),
        VialidadesA(
            31,
            "31-Santiago Tianguistenco-Tenango",
            listOf(
                Seccion("202B")
            )
        ),
        VialidadesA(
            32,
            "32-Amomolulco-Xonacatlan",
            listOf(
                Seccion("224A-1"),
                Seccion("224A-2")
            )
        ),
        VialidadesA(
            33,
            "33-Villa del Carbón-Chapa de Mota",
            listOf(
                Seccion("1699-1"),
                Seccion("1699-2")
            )
        ),
        VialidadesA(
            34,
            "34-Laterales Carretera México Toluca",
            listOf(
                Seccion("Laterales Méx.Tol-1"),
                Seccion("Laterales Méx.Tol-2")
            )
        ),
        VialidadesA(
            35,
            "35-Indios Verdes-San Juan Ixhuatepec",
            listOf(
                Seccion("984-1"),
                Seccion("984-2")
            )
        ),
        VialidadesA(
            36,
            "36-Carretera Atlacomulco Palmillas Aculco",
            listOf(
                Seccion("640-1"),
                Seccion("640-2")
            )
        ),
        VialidadesA(
            37,
            "37-Carretera a Almoloya de Juárez",
            listOf(
                Seccion("253-1"),
                Seccion("253-2")
            )
        ),
        VialidadesA(
            38,
            "38-Jilotepec-San Agustín",
            listOf(
                Seccion("661")
            )
        ),
        VialidadesA(
            39,
            "39-Avenida Salvador Díaz Mirón",
            listOf(
                Seccion("6002-1"),
                Seccion("6002-2")
            )
        ),
        VialidadesA(
            40,
            "40-Carretera México Querétaro a Huehuetoca",
            listOf(
                Seccion("795-1"),
                Seccion("795-2")
            )
        ),
        VialidadesA(
            41,
            "41-Nicolás Romero-Jilotzingo-E. km 56.6",
            listOf(
                Seccion("764")
            )
        ),
        VialidadesA(
            42,
            "42-Periférico Norte centrales",
            listOf(
                Seccion("1070-1"),
                Seccion("1070-2"),
                Seccion("1070-3"),
                Seccion("1070-4")
            )
        ),
        VialidadesA(
            43,
            "43-Nicolás Romero-Isidro Fabela",
            listOf(
                Seccion("CG-608")
            )
        ),
        VialidadesA(
            44,
            "44-Chalco-San Mateo Huiltzilzingo-Lim. Méx./D.F.",
            listOf(
                Seccion("887-1"),
                Seccion("887-2")
            )
        ),
        VialidadesA(
            45,
            "45-Huixquilucan-Santiago Yancuitlalpan",
            listOf(
                Seccion("3043")
            )
        ),
        VialidadesA(
            46,
            "46-Calzada Al Pacífico",
            listOf(
                Seccion("3013-1"),
                Seccion("3013-2")
            )
        ),
        VialidadesA(
            47,
            "47-Toluca San Felipe Tlalmimilolpan",
            listOf(
                Seccion("Tol. Tlalmimilolpan-1"),
                Seccion("Tol. Tlalmimilolpan-2")
            )
        ),
        VialidadesA(
            48,
            "48-Carretera México Pachuca, tramo Puente de Fierro a la carretera Lechería- Texcoco",
            listOf(
                Seccion("CG-511-1"),
                Seccion("CG-511-2")
            )
        ),
        VialidadesA(
            49,
            "49-Melchor Ocampo-Zumpango",
            listOf(
                Seccion("797B-1")
            )
        ),
        VialidadesA(
            50,
            "50-Paseo Colón",
            listOf(
                Seccion("311-1"),
                Seccion("311-2"),
                Seccion("311-3")
            )
        ),
        VialidadesA(
            51,
            "51-Teoloyucan-Jaltenco",
            listOf(
                Seccion("8049")
            )
        ),
        VialidadesA(
            53,
            "53-Camino al Agostadero",
            listOf(
                Seccion("564-1"),
                Seccion("564-2")
            )
        ),
        VialidadesA(
            54,
            "54-Avenida Ceylan",
            listOf(
                Seccion("758-1"),
                Seccion("758-2")
            )
        ),
        VialidadesA(
            55,
            "55-Teoloyucan-Coyotepec",
            listOf(
                Seccion("780A")
            )
        ),
        VialidadesA(
            56,
            "56-Chalco-San Pedro Tlahuac",
            listOf(
                Seccion("886-1"),
                Seccion("886-2")
            )
        ),
        VialidadesA(
            57,
            "57-Av. López Portillo",
            listOf(
                Seccion("Av. López Portillo-1"),
                Seccion("Av. López Portillo-2"),
                Seccion("Av. López Portillo-3"),
                Seccion("Av. López Portillo-4")
            )
        ),
        VialidadesA(
            58,
            "58-Periférico Norte Laterales",
            listOf(
                Seccion("1071-1"),
                Seccion("1071-2"),
                Seccion("1071-3"),
                Seccion("1071-4")
            )
        ),
        VialidadesA(
            59,
            "59-Coyotepec-Huehuetoca",
            listOf(
                Seccion("780B")
            )
        ),
        VialidadesA(
            60,
            "60-Boulevard Aeropuerto",
            listOf(
                Seccion("1064-1"),
                Seccion("1064-2"),
                Seccion("1064-3"),
                Seccion("1064-4"),
                Seccion("1064-5"),
                Seccion("1064-6"),
                Seccion("1064-7"),
                Seccion("1064-8")
            )
        ),
        VialidadesA(
            61,
            "61-km 57(Jajalpa-San Fco. Tepexoxuca)-Joquicingo",
            listOf(
                Seccion("1463")
            )
        ),
        VialidadesA(
            62,
            "62-Vía Alfredo del Mazo",
            listOf(
                Seccion("299-1"),
                Seccion("299-2")
            )
        ),
        VialidadesA(
            64,
            "64-km. 35.8 (Toluca-Taxco) Joquicingo-Malinalco",
            listOf(
                Seccion("181A-1"),
                Seccion("181A-2")
            )
        ),
        VialidadesA(
            65,
            "65-La Marquesa -Santiago Tiaguistenco",
            listOf(
                Seccion("202A-1"),
                Seccion("202A-2")
            )
        ),
        VialidadesA(
            66,
            "66-Boulevard Turístico Ixtapan de la Sal-Tonatico",
            listOf(
                Seccion("6204-1"),
                Seccion("6204-2")
            )
        ),
        VialidadesA(
            67,
            "67-Malinalco-Chalma",
            listOf(
                Seccion("181B")
            )
        ),
        VialidadesA(
            68,
            "68-Carretera México Querétaro a Coyotepec",
            listOf(
                Seccion("796")
            )
        ),
        VialidadesA(
            69,
            "69-Av. Tecnológico",
            listOf(
                Seccion("Av. Tecnológico-1"),
                Seccion("Av. Tecnológico-2")
            )
        ),
        VialidadesA(
            70,
            "70-Libramiento Sur",
            listOf(
                Seccion("Lib. Sur-1"),
                Seccion("Lib. Sur-2")
            )
        )
    )
} }
