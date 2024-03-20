package com.axis.axisfotografias.elementos

data class VialidadesA(
    val idVialidad: Int,
    val nombre: String,
    val secciones: List<Seccion>
)

data class Seccion(
    val secc: String,
    val carril: String
)
{companion object{
    val vialidades = listOf(
        VialidadesA(
            3,
            "3-Vía Morelos",
            listOf(
                Seccion("759-1", "LD"),
                Seccion("759-2", "LD"),
                Seccion("759-3", "LI"),
                Seccion("759-4", "LI")
            )
        ),
        VialidadesA(
            5,
            "5-Boulevard Cuauhtémoc",
            listOf(
                Seccion("6003-1", "LD"),
                Seccion("6003-2", "LI"),
                Seccion("6003-3", "LD"),
                Seccion("6003-4", "LI")

            )
        ),
        VialidadesA(
            7,
            "7-Vía José López Portillo",
            listOf(
                Seccion("300-1", "LD"),
                Seccion("300-2", "LI")
            )
        ),

        VialidadesA(
            8,
            "8-Vialidad Mexiquense",
            listOf(
                Seccion("V. Mexiquense-1", "LD"),
                Seccion("V. Mexiquense-2", "LD"),
                Seccion("V. Mexiquense-3", "LI"),
                Seccion("V. Mexiquense-4", "LI")
            )
        )

    )

} }
