package de.westnordost.streetcomplete.quests.way_lit

import de.westnordost.streetcomplete.osm.lit.LitStatus

sealed interface WayLitOrIsStepsAnswer
object IsActuallyStepsAnswer : WayLitOrIsStepsAnswer
data class WayLit(val litStatus: LitStatus) : WayLitOrIsStepsAnswer

