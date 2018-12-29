(deftemplate flower
    (slot name)
)


(defrule size-small
(size ?v )
(test (> ?v 10))
(test (< ?v 50))
=>
(assert (height small))
)

(defrule size-medium
(size ?v )
(test (> ?v 50))
(test (< ?v 150))
=>
(assert (height medium))
)

(defrule size-tall
(size ?v )
(test (> ?v 150))
=>
(assert (height tall))
)


(defrule cycle-annual
(cycle one-year)
=>
(assert (life annual))
)

(defrule cycle-perennial
(cycle more-than-one-year)
=>
(assert (life perennial))
)




(defrule flowertype1
(season summer)
(color ?v & blue|purple|yellow)
(life perennial)
(root bulb)
=> 
(assert (flower (name Iris))
)
)



(defrule flowertype2
(season autumn)
(color ?v & white|pink|pinkish-red)
=> 
(assert (flower (name Anemone))
)
)




(defrule flowertype3
(season autumn)
(height medium)
(color ?v & white|yellow|purple|red)
=> 
(assert (flower (name Chrysanthemum))
)
)





(defrule flowertype4
(season spring)
(root bulbs)
(color ?v & white|yellow|purple|red|orange|blue)
(perfumed true)
=> 
(assert (flower (name Freesia))
)
)


(defrule flowertype5
(life perennial)
(height tall)
(root bulbs)
(season summer)
=> 
(assert (flower (name Dahlia))
)
)




(defrule flowertype6
(color ?v & white|yellow)
(root bulbs)
(season spring)
=> 
(assert (flower (name Narcissus))
)
)



(defrule flowertype7
(life perennial)
(color ?v & white|pink|red)
(root roots)
(soil acidic)
=> 
(assert (flower (name Camellia))
)
)



(defrule flowertype8
(season spring)
(root bulbs)
(perfumed true)
(height small)
(life perennial)
=> 
(assert (flower (name Lily))
)
)



(defrule flowertype9
(soil ?v & fertile|loose|rich)
(height small)
(life annual)
=> 
(assert (flower (name Begonia))
)
)



(defrule flowertype10
(color ?v & white|pink|red)
(season winter)
=> 
(assert (flower (name Azalea))
)
)





(defrule flowertype11
(color ?v & white|blue|yellow|red)
(season winter)
(life perennial)
(root roots)

=> 
(assert (flower (name Anemone))
)
)


(defrule flowertype12 
(life perenial)
(root roots)
(color ?v & white|pink|red|yellow)
(perfumed true)
(soil well-drained)
=>
(assert (flower (name Rose))
)
)


(defrule flowertype13
(flower ( name lily))
(perfumed true)
=>
   (assert (flower (name white-lily))
)
)

