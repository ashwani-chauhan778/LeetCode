# Last updated: 8/1/2025, 2:41:55 PM
class Solution:
    def twoSum(self, input_list: list[int], desired_sum: int) -> list[int]:
        value_to_position = {}

        for index, current_value in enumerate(input_list):
            if desired_sum - current_value in value_to_position:
                return [value_to_position[desired_sum - current_value], index]
            
            value_to_position[current_value] = index

        return []
