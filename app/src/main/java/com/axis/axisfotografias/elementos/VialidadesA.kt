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
                Seccion("Méx. Puebla-1")
            )
        )

    )

} }
