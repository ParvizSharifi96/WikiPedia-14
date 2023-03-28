package com.example.wikipedia_14.fragments


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wikipedia_14.MainActivity2
import com.example.wikipedia_14.adapter.ExploreAdapter
import com.example.wikipedia_14.adapter.ItemEvents
import com.example.wikipedia_14.data.ItemPost
import com.example.wikipedia_14.databinding.FragmentExploreBinding
const val SEND_DATA_TO_SECOND_ACTIVITY = "sendData"

class FragmentExplore : Fragment(), ItemEvents {
    lateinit var binding: FragmentExploreBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentExploreBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dataExplore = listOf(

            // Explore Section =>

            ItemPost(
                "https://cdn.motor1.com/images/mgl/wloA26/s3/volvo-fh-electric.jpg",
                "Volvo",
                "Truck manufacturing group",
                "The Volvo Group appreciates the value of sound corporate governance as a fundamental base in achieving a trusting relation with shareholders and other key parties.\n" +
                        "The Swedish Corporate Governance Code (Code), applied by the Volvo Group, aims at empowering the shareholders and creating a sound balance of power between shareholders, the board of directors and the senior management.\n" +
                        "\n" +
                        "Sound corporate governance, characterized by high standards when it comes to transparency, reliability and ethic values, has always been a well established guiding principle within the Volvo Group's operations.The CEO is in charge of the Group's daily management through the Group Executive Board.\n" +
                        "\n" +
                        "The Group Executive Board is the highest operational decision forum in the Group, subordinated to the AB Volvo Board of Directors.\n" +
                        "\n" +
                        "Members of the Group Executive Board are the CEO, CFO, the Presidents of Volvo Trucks, Renault Trucks, Mack Trucks, Volvo Construction Equipment and the heads of Trucks Divisions and Group Functions. Members of the Group Executive Boards have the title Executive Vice President (EVP).\n" +
                        "\n" +
                        "The Group Executive Board comprises 15 members including the CEO.\n" +
                        "\n" +
                        "In addition, the Presidents of the Business Areas Volvo Buses, Volvo Penta, ARQUUS, VAS and VFS also report directly to the CEO and are part of the Group Management together with the Group CDO and the members of the Group Executive Board. " ,
                false,
                ""
            ),


            ItemPost(
                "https://dunijet.ir/YaghootAndroidFiles/Wikipedia/ezra_meeker.jpg",
                "Ezra Meeker",
                "American pioneer (1830-1928)",
                "Ezra Manning Meeker (December 29, 1830 – December 3, 1928) was an American pioneer who traveled the Oregon Trail by ox-drawn wagon as a young man, migrating from Iowa to the Pacific Coast. Later in life he worked to memorialize the Trail, repeatedly retracing the trip of his youth. Once known as the \"Hop King of the World\", he was the first mayor of Puyallup, Washington.\n" +
                        "\n" +
                        "Meeker was born in Butler County, Ohio, to Jacob and Phoebe Meeker. His family relocated to Indiana when he was a boy. He married Eliza Jane Sumner in 1851; the following year the couple, with Ezra's brother and with their newborn son, set out for the Oregon Territory, where land could be claimed and settled on. Although they endured hardships on the Trail in the journey of nearly six months, the entire party survived the trek. Meeker and his family briefly stayed near Portland, then journeyed north to live in the Puget Sound region. They settled at what is now Puyallup in 1862, where Meeker grew hops for use in brewing beer. By 1887, his business had made him wealthy, and his wife built a large mansion for the family. In 1891, an infestation of hop aphids destroyed his crops and took much of his fortune. He later tried his hand at a number of ventures, and made four largely unsuccessful trips to the Klondike, taking groceries and hoping to profit from the gold rush.\n" +
                        "\n" +
                        "Meeker became convinced that the Oregon Trail was being forgotten, and he determined to bring it publicity so it could be marked and monuments erected. In 1906–1908, while in his late 70s, he retraced his steps along the Oregon Trail by wagon, seeking to build monuments in communities along the way. His trek reached New York City, and in Washington, D.C., he met President Theodore Roosevelt. He traveled the Trail again several times in the final two decades of this life, including by oxcart in 1910–1912 and by airplane in 1924. During another such trip, in 1928, Meeker fell ill but was succored by Henry Ford. On his return to Washington state, Meeker became ill again and died there on December 3, 1928, at the age of 97. Meeker wrote several books; his work has continued through the activities of such groups as the Oregon-California Trails Association.\n" +
                        "\n",
                false,
                ""
            ),

            ItemPost(
                "https://congaudio.com.vn/media/news/303_beethoven00_19.jpg",
                "Piano Beethoven",
                "1822 piano sonata by Ludwig Beethoven",
                "Ludwig van Beethoven baptised 17 December 1770 – 26 March 1827 was a German composer and pianist. Beethoven remains one of the most admired composers in the history of Western music; his works rank amongst the most performed of the classical music repertoire and span the transition from the Classical period to the Romantic era in classical music. His career has conventionally been divided into early, middle, and late periods. His early period, during which he forged his craft, is typically considered to have lasted until 1802. From 1802 to around 1812, his middle period showed an individual development from the styles of Joseph Haydn and Wolfgang Amadeus Mozart, and is sometimes characterized as heroic. During this time, he began to suffer increasingly from deafness. In his late period, from 1812 to 1827, he extended his innovations in musical form and expression.\n" +
                        "\n" +
                        "Born in Bonn, Beethoven's musical talent was obvious at an early age, and he was initially harshly and intensively taught by his father Johann van Beethoven. Beethoven was later taught by the composer and conductor Christian Gottlob Neefe, under whose tutelage he published his first work, a set of keyboard variations, in 1783. He found relief from a dysfunctional home life with the family of Helene von Breuning, whose children he loved, befriended, and taught piano. At age 21, he moved to Vienna, which subsequently became his base, and studied composition with Haydn. Beethoven then gained a reputation as a virtuoso pianist, and he was soon patronized by Karl Alois, Prince Lichnowsky for compositions, which resulted in his three Opus 1 piano trios (the earliest works to which he accorded an opus number) in 1795.\n" +
                        "\n" +
                        "His first major orchestral work, the First Symphony, premiered in 1800, and his first set of string quartets was published in 1801. Despite his hearing deteriorating during this period, he continued to conduct, premiering his Third and Fifth Symphonies in 1804 and 1808, respectively. His Violin Concerto appeared in 1806. His last piano concerto (No. 5, Op. 73, known as the Emperor), dedicated to his frequent patron Archduke Rudolf of Austria, was premiered in 1811, without Beethoven as soloist. He was almost completely deaf by 1814, and he then gave up performing and appearing in public. He described his problems with health and his unfulfilled personal life in two letters, his Heiligenstadt Testament (1802) to his brothers and his unsent love letter to an unknown \"Immortal Beloved\" (1812).\n" +
                        "\n" +
                        "After 1810, increasingly less socially involved, Beethoven composed many of his most admired works, including later symphonies, mature chamber music and the late piano sonatas. His only opera, Fidelio, first performed in 1805, was revised to its final version in 1814. He composed Missa solemnis between 1819 and 1823 and his final Symphony, No. 9, one of the first examples of a choral symphony, between 1822 and 1824. Written in his last years, his late string quartets, including the Grosse Fuge, of 1825–1826 are among his final achievements. After some months of bedridden illness, he died in 1827. Beethoven's works remain mainstays of the classical music repertoire.\n" +
                        "\n",
                false,
                ""
            ),

            ItemPost(
                "http://photos.wikimapia.org/p/00/03/50/14/06_big.jpg",
                "Surrogate's Courthouse",
                "Historic courthouse in Manhattan",
                "The Surrogate's Courthouse (also the Hall of Records and 31 Chambers Street) is a historic building at the northwest corner of Chambers and Centre Streets in the Civic Center of Manhattan in New York City. Completed in 1907, it was designed in the Beaux Arts style. John Rochester Thomas created the original plans while Arthur J. Horgan and Vincent J. Slattery oversaw the building's completion. The building faces City Hall Park and the Tweed Courthouse to the south and the Manhattan Municipal Building to the east.\n" +
                        "\n" +
                        "The Surrogate's Courthouse is a seven-story, steel-framed structure with a granite facade and elaborate marble interiors. The fireproof frame was designed to safely accommodate the city's paper records. The exterior is decorated with 54 sculptures by Philip Martiny and Henry Kirke Bush-Brown, as well as a three-story Corinthian order colonnade on Chambers and Reade Streets. The basement houses the New York City Municipal Archives. The fifth floor contains the New York Surrogate's Court for New York County, which handles probate and estate proceedings for the New York State Unified Court System.\n" +
                        "\n" +
                        "The Hall of Records building had been planned since the late 19th century to replace an outdated building in City Hall Park; plans for the current building were approved in 1897. Construction took place between 1899 and 1907, having been subject to several delays because of controversies over funding, sculptures, and Horgan and Slattery's involvement after Thomas's death in 1901. Renamed the Surrogate's Courthouse in 1962, the building has undergone few alterations over the years. The Surrogate's Courthouse is listed on the National Register of Historic Places as a National Historic Landmark, and its facade and interior are both New York City designated landmarks.\n" +
                        "\n",
                false,
                ""
            ),


            ItemPost(
                "https://dunijet.ir/YaghootAndroidFiles/Wikipedia/texas_hurricane.jpg",
                "1916 Texas hurricane",
                "Category 4 Atlantic hurricane",
                "The 1916 Texas hurricane was an intense and quick-moving tropical cyclone that caused widespread damage in Jamaica and South Texas in August 1916. A Category 4 hurricane upon landfall in Texas, it was the strongest tropical cyclone to strike the United States in three decades. Throughout its eight-day trek across the Caribbean Sea and Gulf of Mexico, the hurricane caused 37 fatalities and inflicted \$11.8 million in damage.\n" +
                        "\n" +
                        "Weather observations were limited for most of the storm's history, so much of its growth has been inferred from scant data analyzed by the Atlantic hurricane reanalysis project in 2008. The precursor disturbance organized into a small tropical storm by August 12, shortly before crossing the Lesser Antilles into the Caribbean Sea. The storm skirted the southern coast of Jamaica as a hurricane on August 15, killing 17 people along the way. No banana plantation was left unscathed by the hours-long onslaught of strong winds. Coconut and cocoa trees also sustained severe losses. The southern parishes saw the severest effects, incurring extensive damage to crops and buildings; damage in Jamaica amounted to \$10 million (equivalent to \$238 million in 2020). The storm then traversed the Yucatán Channel into the Gulf of Mexico and intensified further into the equivalent of a major hurricane on the modern-day Saffir–Simpson scale.\n" +
                        "\n" +
                        "On the evening of August 16, the hurricane struck southern Texas near Baffin Bay with winds of 130 mph (215 km/h). Buildings were razed at many coastal cities, the worst impacts being felt in Corpus Christi and surrounding communities. Beachfront structures were destroyed by a 9.2-foot (2.8 m) storm surge. Strong gusts and heavy rainfall spread farther inland across mainly rural sectors of southern Texas, damaging towns and their outlying agricultural districts alike. Railroads and other public utilities were disrupted across the region, with widespread power outages. Eight locations set 24-hour rainfall records; among them was Harlingen, which recorded the storm's rainfall maximum with 6 inches (150 mm) of precipitation. The deluge wrought havoc on military camps along the Mexico–United States border, forcing 30,000 garrisoned militiamen to evacuate. Aggregate property damage across Texas reached \$1.8 million (equivalent to \$43 million in 2020), and 20 people were killed. The hurricane quickly weakened over southwestern Texas and dissipated near New Mexico by August 20.\n" +
                        "\n",
                false,
                ""
            ),

            ItemPost(
                "https://dunijet.ir/YaghootAndroidFiles/Wikipedia/australian_boobook.jpg",
                "Australian boobook",
                "species of owl native to Australia",
                "The Australian boobook (Ninox boobook), which is known in some regions as the mopoke, is a species of owl native to mainland Australia, southern New Guinea, the island of Timor, and the Sunda Islands. Described by John Latham in 1801, it was generally considered to be the same species as the morepork of New Zealand until 1999. Its name is derived from its two-tone boo-book call. Eight subspecies of the Australian boobook are recognized, with three further subspecies being reclassified as separate species in 2019 due to their distinctive calls and genetics.\n" +
                        "\n" +
                        "The smallest owl on the Australian mainland, the Australian boobook is 27 to 36 cm (10.5 to 14 in) long, with predominantly dark-brown plumage with prominent pale spots. It has grey-green or yellow-green eyes. It is generally nocturnal, though is sometimes active at dawn and dusk, retiring to roost in secluded spots in the foliage of trees. The Australian boobook feeds on insects and small vertebrates, hunting by pouncing on them from tree perches. Breeding takes place from late winter to early summer, using tree hollows as nesting sites. The International Union for Conservation of Nature has assessed the Australian boobook as being of least concern on account of its large range and apparently stable population.\n" +
                        "\n",
                false,
                ""
            )

        )

        val myAdapter = ExploreAdapter(dataExplore, this)

        binding.recyclerExplore.adapter = myAdapter
        binding.recyclerExplore.layoutManager =
            LinearLayoutManager(context, RecyclerView.VERTICAL, false)


    }

    override fun onItemClicked(itemPost: ItemPost) {
        val intent = Intent(activity, MainActivity2::class.java)
        intent.putExtra(SEND_DATA_TO_SECOND_ACTIVITY, itemPost)
        startActivity(intent)

    }


}
